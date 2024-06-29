package exercises.part2oop

object Exercise1NovelWriter extends App {
  val writer = new Writer("Charles", "Dickens", 1861)
  val imposter = new Writer("Charles", "Dickens", 1861)
  val novel = new Novel("The Expressions", 1899, writer)
  println(novel.authorAge())
  println(novel.isWrittenBy(writer))
  println(novel.isWrittenBy(imposter))
  println(novel.copy(2006))
}

class Writer(val firstName: String, val surname: String, val year: Int) {
  def fullName(): String = {
    firstName + " " + surname
  }
}

class Novel(val name: String, val yearOfRelease:Int, val author: Writer) {

  def authorAge(): Int = {
    this.yearOfRelease - author.year
  }

  def isWrittenBy(author: Writer): Boolean = {
    if (this.author.firstName.equals(author.firstName)
      && this.author.surname.equals(author.surname)
      && this.author.year == author.year) {
      return true
    }
    false
  }

  def copy(newReleaseYear: Int): Novel = {
    new Novel(this.name, newReleaseYear, this.author)
  }
}