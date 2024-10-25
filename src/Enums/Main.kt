package Enums

import Enums.attributes.ErrorType
import Enums.constructor.ColorsType
import Enums.simple.ConnectionType

fun main() {
    val simpleEnum = ConnectionType.WIFI
    println(simpleEnum)

    val constructorEnum = ColorsType.RED
    println("Color: $constructorEnum, Hexa: ${constructorEnum.hexa}")

    val errorEnum = ErrorType.LOGIN_ERROR
    println("Error: $errorEnum, code: ${errorEnum.getCodeError()}, title: ${errorEnum.titleError}")

}