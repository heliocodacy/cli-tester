public class Test {
  
  int fibonacci(int number) {
     if ( number <= 1) {
         return number;
     }
     /* this is a test for introducing new tokens as comments Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec at metus fermentum, molestie odio sed, egestas ex. Donec quam libero, vehicula ac semper id, congue sed orci. Vivamus sed vehicula risus. Proin feugiat ut elit a vestibulum. Suspendisse in pulvinar enim, id molestie nunc. Quisque finibus, libero ut elementum eleifend, nibh metus semper mauris, ut feugiat odio lorem sed est. Integer eu venenatis mauris, vel congue sapien. Nam euismod congue neque, in porta metus. Fusce semper mauris at orci maximus, id ultricies nisi cursus. Duis facilisis venenatis fringilla. Vestibulum finibus imperdiet rutrum. Aenean rutrum tincidunt libero. */
     return fibonacci(number - 1) + fibonacci(number - 2);
 }
 
 int fibonacci2(int number) {
     if ( number <= 1) {
         return number;
     }
     /* this is a test for introducing new tokens as comments Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec at metus fermentum, molestie odio sed, egestas ex. Donec quam libero, vehicula ac semper id, congue sed orci. Vivamus sed vehicula risus. Proin feugiat ut elit a vestibulum. Suspendisse in pulvinar enim, id molestie nunc. Quisque finibus, libero ut elementum eleifend, nibh metus semper mauris, ut feugiat odio lorem sed est. Integer eu venenatis mauris, vel congue sapien. Nam euismod congue neque, in porta metus. Fusce semper mauris at orci maximus, id ultricies nisi cursus. Duis facilisis venenatis fringilla. Vestibulum finibus imperdiet rutrum. Aenean rutrum tincidunt libero. */
     return fibonacci(number - 1) + fibonacci(number - 2);
 }
}
