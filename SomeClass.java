class HelloWorld() {
  private String name;
  public HelloWorld(String name) {
    System.out.println("Hello " + name);
  }
  

  public void printMessage(String message) {
    System.out.println(message);
  }

  public static void main(int argv[]) {
    HelloWorld hw = new HelloWorld("Matthew");
  }
  
  public void complimet() {
	System.out.println("You are awesome!");
}
