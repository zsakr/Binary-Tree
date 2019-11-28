# Binary-Tree
The class LinkedBinaryTree provides a complete implementation of the BinaryTree ADT. This implementation depends on different abstract classes and interfaces. First, identify which of the files you were given are relavant to the implementation of the BinaryTree ADT. Then, generate javadoc for those files. Study the resulting documentation (index.html) to learn about the provided functionalities. 
# Specifically, understand the difference between BinaryTree, AbstractBinaryTree and LinkedBinaryTree objects.

# Part1:
In the main() method in the BinaryTreeTester class, create a new binary tree of height 3 that stores Integer values of your choosing. Print out your tree using methods printPreorderIndent() and parenthesize() defined in the BinaryTreeTester class. Also, print out the size of the tree, the tree height and the depth of the root node.

# Part 2:
The BinaryTreeTester class includes three methods for printing elements of a tree using pre- order, postorder and inorder traversal techniques. These methods are called printPreorder(), printPostorder() and printInorder() and rely on preorder(), postorder(), and inorder() methods, respectively, provided in AbstractTree and AbstractBinaryTree classes. These methods return an Iterable collection of nodes in an appropriate order. Therefore, the above methods simply print out the nodes in the collection.
First, print the tree I created in Part 1 using these three methods. Then, design and imple- ment three static methods called recPrintPreorder(), recPrintPostorder(), and recPrintInorder() that recursively print a tree using the algorithms below.
Once I am done, print my tree using these methods and compare the output to the output obtained using the traversal methods. For example, for the preorder method, I should be able to test it as follows, where tree is the name of the tree from Part 1.

    recPrintPreorder(tree);
    recPrintPreorder(tree);
This means that I will need to create a helper method recPrintPreorder(tree, p) to recursively process each subtree tree rooted at p. For example:

    public static <E> void recPrintPreorder(AbstractBinaryTree<E> T){ recPrintPreorder(T,T.root());
    }
    public static <E> void recPrintPreorder(AbstractBinaryTree<E> T, Position<E> p){
        //My code
       }
  
# Below is the Algorithm I used for the tree

# Preorder
  Algorithm preorder(p)
  
      Perform the visit action on p
      
      for each child c in children(p) do 
      
            preorder(c)
            
# Postorder

  Algorithm postorder(p)
  
      for each child c in children(p) do 
      
              postorder(c)
              
         Perform the visit action on p
         
# Inorder
   Algorithm inorder(p)
   
      if p has a left child lc then 
      
          inorder(lc)
          
      Perform the visit action on p 
      
      if p has a right child rc then 
      
          inorder(rc)

