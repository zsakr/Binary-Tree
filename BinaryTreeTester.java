/** 
 * A tester class for the Binary Tree ADT
 *
 */

public class BinaryTreeTester {

  /** Uses StringBuilder to compose a String with n copies of character c.
  *  @param c  character to repeat
  *  @param n  number of copies
  *  @return String composed of n repetitions of c
  */
  public static String repeat2(char c, int n) {
    StringBuilder sb = new StringBuilder();
    for (int j=0; j < n; j++)
      sb.append(c);
    return sb.toString();
  }
  
  /** Returns a string containing n spaces.
  *  @param n  number of spaces
  *  @return String composed of n spaces 
  */
  public static String spaces(int n) {
    return repeat2(' ', n);
  }
  
  /** Prints indented preorder representation of subtree of T rooted at p having depth d.
  *  @param T  reference to the subtree to process
  *  @param p  reference to the root of T
  *  @param d  depth of p
  */
  public static <E> void printPreorderIndent(AbstractBinaryTree<E> T, Position<E> p, int d) {
    System.out.println(spaces(2*d) + p.getElement());   // indent based on d
    for (Position<E> c : T.children(p))
      printPreorderIndent(T, c, d+1);                   // child depth is d+1
  }

  /** Prints parenthesized representation of subtree of T rooted at p.
  *  @param T  reference to the subtree to process
  *  @param p  reference to the root of T
  */
  public static <E> void parenthesize(AbstractBinaryTree<E> T, Position<E> p) {
    System.out.print(p.getElement());
    if (T.isInternal(p)) {
      boolean firstTime = true;
      for (Position<E> c : T.children(p)) {
        System.out.print( (firstTime ? " (" : ", ") ); // determine proper punctuation
        firstTime = false;                             // any future passes will get comma
        parenthesize(T, c);                            // recur on child
      }
      System.out.print(")");
    }
  }
  
  /** Prints preorder representation of tree of T
  *  @param T  reference to the tree to process
  */
  public static <E> void printPreorder(AbstractBinaryTree<E> T) {
    for (Position<E> p : T.preorder())
      System.out.print(p.getElement() + " ");
  }

  /** Prints postorder representation of tree of T
  *  @param T  reference to the tree to process
  */
  public static <E> void printPostorder(AbstractBinaryTree<E> T) {
    for (Position<E> p : T.postorder()) 
      System.out.print(p.getElement() + " ");
  }
  
  /** Prints inorder representation of tree of T
  *  @param T  reference to the tree to process
  */
  public static <E> void printInorder(AbstractBinaryTree<E> T) {
    for (Position<E> p : T.inorder()) 
      System.out.print(p.getElement() + " ");
  }
  

  public static void main(String args[]) {
  
    LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<Integer>();
    
    
  }



}
