package my.contacts
//import kotlin.io
import java.io.File

val file_path_resources: String = "src/main/resources/"

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    input_data()
    print_data()
}

fun input_data() {
    val file = File(file_path_resources+"contacts_list.txt")
    val data = readln()
    file.appendText(data+'\n')
}

fun print_data() {
    val file = File(file_path_resources+"contacts_list.txt")
    val content: String = file.readText()
    println(content)
}