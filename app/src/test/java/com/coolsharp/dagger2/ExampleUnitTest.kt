package com.coolsharp.dagger2

import com.coolsharp.dagger2.example4.DaggerMyComponent
import com.coolsharp.dagger2.example4.MyComponent
import com.coolsharp.dagger2.example5.*
import com.coolsharp.dagger2.example6.DaggerPersonComponent
import com.coolsharp.dagger2.example6.PersonA
import com.coolsharp.dagger2.example6.PersonB
import com.coolsharp.dagger2.example6.PersonComponent
import dagger.MembersInjector
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun provisionMethodsComponent() {
        val myComponent: MyComponent = DaggerMyComponent.create()
        println("result = ${myComponent.string}")

        val myClass: MyClass = MyClass()
        var str = myClass.str
        println(str)
        val provisionMethodsComponent: ProvisionMethodsComponent = DaggerProvisionMethodsComponent.create()
        provisionMethodsComponent.inject(myClass)
        str = myClass.str
        println(str)
    }

    @Test
    fun testMemberInjector() {
        val coffeeMaker: CoffeeMaker = CoffeeMaker()
        var str = coffeeMaker.str
        println(str)
        val memberInjectionMethodsComponent: MemberInjectionMethodsComponent = DaggerMemberInjectionMethodsComponent.create()
        val injector: MembersInjector<CoffeeMaker> = memberInjectionMethodsComponent.injector
        injector.injectMembers(coffeeMaker)
        str = coffeeMaker.str
        println(str)
    }

    @Test
    fun testInjection() {
        val personComponent: PersonComponent = DaggerPersonComponent.create()

        val personA: PersonA = personComponent.personA;
        println(personA.name + " : " + personA.age)

        val personB: PersonB = PersonB();
        DaggerPersonComponent.create().inject(personB)
        println(personB.name + " : " + personB.age)
    }
}