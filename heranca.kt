abstract class Animal(val name: String) {
    // Método abstrato que será sobrescrito pelas classes filhas
    abstract fun makeSound()
}


class Dog(name: String) : Animal(name) {
    // Sobrescrevendo o método makeSound para exibir "Woof!"
    override fun makeSound() {
        println("Woof!")
    }
}

class Cat(name: String) : Animal(name) {
    // Sobrescrevendo o método makeSound para exibir "Meow!"
    override fun makeSound() {
        println("Meow!")
    }
}



fun animalSounds(animals: List<Animal>) {
    for (animal in animals) {
        println("${animal.name} says:")
        animal.makeSound()
    }
}

// -----------------------------------------------------------------------------
fun main() {
    val animals = listOf(
        Dog("Buddy"),  // Criando instância de Dog
        Cat("Whiskers") // Criando instância de Cat
    )

}
