public class Book{
  String titel = "The Obstacle is the way";
  String author = "Ryan Holiday";
  int numPages = 200;
  int currentPage = 0;
  boolean isOpen = false;
  
  public void opening(){
	  if (!isOpen){
		  isOpen = true;
		  currentPage = 1;
		  System.out.println("The" + titel + "book has been opened");
	  }
	  else{
		  System.out.println("The book is already open");
	  }
  }
  
  public void turnPage(){
	  if (isOpen){
		  if (currentPage < numPages){
			  currentPage++;
			 System.out.println("You have been turnPage to " + currentPage); 
		  }
		  else{
			  System.out.println("You have reached the end of the book");
	  }}
		 else{
			  System.out.println("Open the book first");
		 }
	  }
  
  
  public void closing(){
	  if (isOpen){
		  isOpen = false;
		  currentPage = 0;
		  System.out.println("Closing the book");
		  }
		 else{
		  System.out.println("the book is already close");
		 }
  }	 
		 
  public static void main(String[] args){
	  Book myBook = new Book();
	  myBook.opening();
	  myBook.turnPage();
	  myBook.closing();
  }
  
  }