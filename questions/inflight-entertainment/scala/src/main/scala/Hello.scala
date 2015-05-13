import scala.collection.mutable.HashMap

object Hello {

  def main(args: Array[String]) {
  	val movies: List[Int] = List(122, 180, 240, 10, 130, 140, 116)
  	val flight_length: Int = 370
  	val any_matching_movies = matchingMovies(flight_length, movies)
  	println(any_matching_movies)
  }

  def matchingMovies(flight_length: Int, movies: List[Int]): Boolean = {
  	val hm = new HashMap[Int]()
  	val found = false

  	for (i <- movies) {
  		val k = hm.get(i)

  		k match {
  			case Some(j) => println(j)
  			case None => hm += (i, 1)
  		}

  		println(i)
  	}
  	
  	found	
  }
}
