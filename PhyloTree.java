/* 
 * PhyloTree.java
 *
 * Defines a phylogenetic tree, which is a strictly binary tree 
 * that represents inferred hierarchical relationships between species
 * 
 * There are weights along each edge; the weight from parent to left child
 * is the same as parent to right child.
 *
 * Students may only use functionality provided in the packages
 *     java.lang
 *     java.util 
 *     java.io
 *     
 * Use of any additional Java Class Library components is not permitted 
 * 
 * Igor Kartasovas Truccolo de Macedo
 *
 */
import java.lang.*;
import java.util.*;
import java.io.*;

public class PhyloTree {
    private PhyloTreeNode overallRoot;    // The actual root of the overall tree
    private int printingDepth;            // How many spaces to indent the deepest 
                                          // node when printing
    // CONSTRUCTOR
    // PhyloTree
    // Pre-conditions:
    //        - speciesFile contains the path of a valid FASTA input file
    //        - printingDepth is a positive number
    // Post-conditions:
    //        - this.printingDepth has been set to printingDepth
    //        - A linked tree structure representing the inferred hierarchical
    //          species relationship has been created, and overallRoot points to
    //          the root of this tree
    // Notes:
    //        - A lot happens in this step!  See assignment description for details
    //          on the input format file and how to construct the tree
    //        - If you encounter a FileNotFoundException, print to standard error
    //          "Error: Unable to open file " + speciesFile
    //          and exit with status (return code) 1
    //        - Most of this should be accomplished by calls to loadSpeciesFile and buildTree
    public PhyloTree(String speciesFile, int printingDepth) {
        File species = null;
        Scanner s = null;
        this.printingDepth = printingDepth;

        Species[] speciesList = loadSpeciesFile(speciesFile);
        //for (int i = 0; i < speciesList.length; i++) {
            //if (speciesList[i].getName() == "Cheianthes_indheimeri") {
                //System.out.println(speciesList[i].getName());
            //}
        //}

        buildTree(speciesList);
        return;
    }
    // ACCESSORS
    // getOverallRoot
    // Pre-conditions:
    //    - None
    // Post-conditions:
    //    - Returns the overall root
    public PhyloTreeNode getOverallRoot() {
        //if (this.parent == null)??? return root
        //else getOverallRoot node.parent
        return overallRoot;
    }
    // toString 
    // Pre-conditions:
    //    - None
    // Post-conditions:
    //    - Returns a string representation of the tree
    // Notes:
    //    - See assignment description for proper format
    //        (it will be a kind of reverse in-order [RNL] traversal)
    //    - Can be a simple wrapper around the following toString
    //    - Hint: StringBuilder is much faster than repeated concatenation
    public String toString() {
        return "";
    }
    // toString 
    // Pre-conditions:
    //    - node points to the root of a tree you intend to print
    //    - weightedDepth is the sum of the edge weights from the
    //      overall root to the current root
    //    - maxDepth is the weighted depth of the overall tree
    // Post-conditions:
    //    - Returns a string representation of the tree
    // Notes:
    //    - See assignment description for proper format
    private String toString(PhyloTreeNode node, double weightedDepth, double maxDepth) {
        return "";
    }
    // toTreeString 
    // Pre-conditions:
    //    - None
    // Post-conditions:
    //    - Returns a "newick" string representation in tree format
    // Notes:
    //    - See assignment description for format details
    //    - Can be a simple wrapper around the following toTreeString
    public String toTreeString() {
        return "";
    }
    // toTreeString 
    // Pre-conditions:
    //    - node points to the root of a tree you intend to print
    // Post-conditions:
    //    - Returns a "newick" string representation in tree format
    // Notes:
    //    - See assignment description for proper format
    private String toTreeString(PhyloTreeNode node) {
        return "";
    }
    // getHeight
    // Pre-conditions:
    //    - None
    // Post-conditions:
    //    - Returns the tree height as defined in class
    // Notes:
    //    - Can be a simple wrapper on nodeHeight
    public int getHeight() {
        return 0;
    }
    // getWeightedHeight
    // Pre-conditions:
    //    - None
    // Post-conditions:
    //    - Returns the sum of the edge weights along the
    //      "longest" (highest weight) path from the root
    //      to any leaf node.
    // Notes:
    //   - Can be a simple wrapper for weightedNodeHeight
    public double getWeightedHeight() {
        return 0.0;
    }
    // countAllSpecies
    // Pre-conditions:
    //    - None
    // Post-conditions:
    //    - Returns the number of species in the tree
    // Notes:
    //    - Non-terminals do not represent species
    //    - This functionality is provided for you elsewhere
    //      just call the appropriate method
    public int countAllSpecies() {
        /*
        int count;
        if (PhyloTreeNode.isLeaf()) {
            
        }
        else {
            count += 1;
            //countAllSpecies(getRightChild());
            //countAllSpecies(getLeftChild());
        }
        */
        return 0;
    }
    // getAllSpecies
    // Pre-conditions:
    //    - None
    // Post-conditions:
    //    - Returns an ArrayList containing all species in the tree
    // Notes:
    //    - Non-terminals do not represent species
    // Hint:
    //    - Call getAllDescendantSpecies
    public java.util.ArrayList<Species> getAllSpecies() {
        ArrayList<Species> allSpecies = new ArrayList<Species>();
        /*
        if (PhyloTreeNode.isLeaf()) {
            allSpecies.add(PhyloTreeNode.getSpecies());
        }
        else {
            allSpecies.add(getAllDescendantSpecies(PhyloTreeNode, allSpecies));
        }
        */
        return allSpecies;
    }
    // findTreeNodeByLabel
    // Pre-conditions:
    //    - label is the label of a tree node you intend to find
    //    - Assumes labels are unique in the tree
    // Post-conditions:) (Use 0 for terminals)
    //    - If found: returns the PhyloTreeNode with the specified label
    //    - If not found: returns null
    public PhyloTreeNode findTreeNodeByLabel(String label) {
        return null;
    }
    // findLeastCommonAncestor
    // Pre-conditions:
    //    - label1 and label2 are the labels of two species in the tree
    // Post-conditions:
    //    - If either node cannot be found: returns null
    //    - If both nodes can be found: returns the PhyloTreeNode of their
    //      common ancestor with the largest depth
    //      Put another way, the least common ancestor of nodes A and B
    //      is the only node in the tree where A is in the left tree
    //      and B is in the right tree (or vice-versa)PRINTING_DEPTH
    // Notes:
    //    - Can be a wrapper around the static findLeastCommonAncestor
     public PhyloTreeNode findLeastCommonAncestor(String label1, String label2) {
        return null;
    }
    
    // findEvolutionaryDistance
    // Pre-conditions:
    //    - label1 and label2 are the labels of two species in the tree
    // Post-conditions:
    //    - If either node cannot be found: returns POSITIVE_INFINITY
    //    - If both nodes can be found: returns the sum of the weights 
    //      along the paths from their least common ancestor to each of
    //      the two nodes
     public double findEvolutionaryDistance(String label1, String label2) {
        return 0.0;
    }
    // MODIFIER
    // buildTree
    // Pre-conditions:
    //    - species contains the set of species for which you want to infer
    //      a phylogenetic tree
    // Post-conditions:
    //    - A linked tree structure representing the inferred hierarchical
    //      species relationship has been created, and overallRoot points to
    //      the root of said tree
    // Notes:
    //    - A lot happens in this step!  See assignment description for details
    //      on how to construct the tree.
    //    - Be sure to use the tie-breaking conventions described in the pdf
    //    - Important hint: although the distances are defined recursively, you
    //      do NOT want to implement them recursively, as that would be very inefficient
    private void buildTree(Species[] species) {
        ArrayList<PhyloTreeNode> forest = new ArrayList<PhyloTreeNode>();
        int countdown = 101;
        for (int i = 0; i < species.length; i++) {
            PhyloTreeNode node = new PhyloTreeNode(null, species[i]);
            forest.add(node);
            //System.out.println(node.getLabel() + i);
            if (node.getLabel() == "Otmannsieopsis_viridis") {
                System.out.println("Found Otmanns");
            }
        }

        MultiKeyMap<Double> nodes = new MultiKeyMap<Double>();
        for (int i = 0; i < forest.size(); i++) {
            for (int y =  i + 1; y < forest.size(); y++) {
                if (forest.get(i).isLeaf()) {
                    nodes.put(species[i].getName(), species[y].getName(), species[i].distance(species[i], species[y]));
                    //System.out.println("Species " + i + ": " + species[i].getName() + " Species " + y + ": " + species[y].getName());
                    //System.out.println(forest.get(i).getSpecies().distance(forest.get(i).getSpecies(), forest.get(y).getSpecies()));
                }
            }
        }
        //while (forest.size() > 1) {
        while (countdown > 0) {
            System.out.println("Forest Size: " + forest.size());
            System.out.println("Countdown: " + countdown);
            //find smallestDistance in forest
            double smallestDistance = 2;
            PhyloTreeNode child1 = null;
            PhyloTreeNode child2 = null;
            double distanceToChildren = 0;
            for (int i = 0; i < forest.size(); i++) {
                for (int y = i + 1; y < forest.size(); y++) {
                    double localDistance = species[i].distance(species[i], species[y]);
                    if (localDistance < smallestDistance) {
                        String[] sorter = new String[2];
                        sorter[0] = forest.get(i).getLabel();
                        sorter[1] = forest.get(y).getLabel();
                        //System.out.println(sorter[0] + "+" + sorter[1]);
                        Arrays.sort(sorter);
                        if (sorter[0] == forest.get(i).getLabel()) {
                            child1 = forest.get(i);
                            child2 = forest.get(y);
                        }
                        else {
                            child1 = forest.get(y);
                            child2 = forest.get(i);
                        }
                        //System.out.println("Children assigned: " + child1.getSpecies().getName() + "+" + child2.getSpecies().getName());
                        smallestDistance = localDistance;
                        distanceToChildren = smallestDistance / 2;
                        
                    }
                
                }    
            }
            //System.out.println(smallestDistance);
            
            //create newNode
            System.out.println("Making Node: " + child1.getLabel() + "+" + child2.getLabel());
            PhyloTreeNode newNode = new PhyloTreeNode(child1.getLabel() + "+" + child2.getLabel(), null, child1, child2, distanceToChildren);

            //remove both children from forest
            for (int i = 0; i < forest.size(); i++) {
                //System.out.println(forest.size());
                //System.out.println(i+1);
                System.out.println("forest: " + forest.get(i).getLabel() + ", index: " + i);                
                if (forest.get(i).getLabel() == newNode.getLeftChild().getLabel() || forest.get(i).getLabel() == newNode.getRightChild().getLabel())  {
                //if (forest.get(i).getSpecies().getName() == newNode.getLeftChild().getLabel() || forest.get(i).getSpecies().getName() == newNode.getRightChild().getLabel()) {
                    
                    System.out.println("LeftChild: " + newNode.getLeftChild().getLabel());
                    System.out.println("RightChild: " + newNode.getRightChild().getLabel());
                    System.out.println("Distance: " + nodes.get(newNode.getLeftChild().getLabel(), newNode.getRightChild().getLabel()));
                    System.out.println("REMOVED: " + forest.get(i).getLabel());
                    forest.remove(i);
                    System.out.println("");
                }
            }
            //System.out.println(child1.getLabel());

            //add new tree to MultiKeyMap
            int t1leaves = newNode.getLeftChild().getNumLeafs();
            int t2leaves = newNode.getRightChild().getNumLeafs();
            int denominator = t1leaves + t2leaves;
            double t1ToOther = 0;
            double t2ToOther = 0;
            double distanceToOther = 0;
            //System.out.println(nodes.get(newNode.getRightChild().getLabel(), "Micromonas_sp._RCC299"));
            for (int i = 0; i < forest.size(); i++) {
                //System.out.println(newNode.getLeftChild().getLabel() + " " + forest.get(i).getLabel() + " " + (i+1));
                //System.out.println(newNode.getRightChild().getLabel() + " " + forest.get(i).getLabel() + " " + (i));
                if ((nodes.get(newNode.getLeftChild().getLabel(), forest.get(i).getLabel()) != null) && (nodes.get(newNode.getRightChild().getLabel(), forest.get(i).getLabel()) != null)) {
                    t1ToOther = nodes.get(newNode.getLeftChild().getLabel(), forest.get(i).getLabel());
                    t2ToOther = nodes.get(newNode.getRightChild().getLabel(), forest.get(i).getLabel());
                    distanceToOther = ((t1leaves*t1ToOther)+(t2leaves*t2ToOther))/denominator;
                    
                    //System.out.println("Added distance to MKM: " + (i + 1));
                    nodes.put(newNode.getLabel(), forest.get(i).getLabel(), distanceToOther);
                }
            }
            

            //remove both children from MultiKeyMap
            //if this comes before adding tree to MKM, we will not be able to find t1ToOther or t2ToOther
            for (int i = 0; i < forest.size(); i++) {
                nodes.remove(newNode.getLeftChild().getLabel(), forest.get(i).getLabel());
                nodes.remove(newNode.getRightChild().getLabel(), forest.get(i).getLabel());
                //System.out.println("Removed distance to MKM: " + (i + 1));
            }

            //add new tree to forest
            forest.add(newNode);
            //System.out.println("Forest size at end: " + forest.size());
            countdown--;
        }
        
        return;
    }
    // STATIC
    // nodeDepth
    // Pre-conditions:
    //    - node is null or the root of tree (possibly subtree)
    // Post-conditions:
    //    - If null: returns -1
    //    - Else: returns the depth of the node within the overall tree
    public static int nodeDepth(PhyloTreeNode node) {
        //if(node == null){
          //  return -1;
        //}
        //else{
          //  return node.getDepth();
        //}
        return -1;
    }

    // nodeHeight
    // Pre-conditions:
    //    - node is null or the root of tree (possibly subtree)
    // Post-conditions:
    //    - If null: returns -1
    //    - Else: returns the height subtree rooted at node
    public static int nodeHeight(PhyloTreeNode node) {
        //if(node == null){
          //  return -1;
        //}
        //else{
          //  return node.get;
        //}
        return -1;
    }
    // weightedNodeHeight 
    // Pre-conditions:
    //    - node is null or the root of tree (possibly subtree)
    // Post-conditions:
    //    - If null: returns NEGATIVE_INFINITY
    //    - Else: returns the weighted height subtree rooted at node
    //     (i.e. the sum of the largest weight path from node
    //     to a leaf; this might NOT be the same as the sum of the weights
    //     along the longest path from the node to a leaf)
    public static double weightedNodeHeight(PhyloTreeNode node) {
        return 0;
    }
    // loadSpeciesFile
    // Pre-conditions:
    //    - filename contains the path of a valid FASTA input file
    // Post-conditions:
    //    - Creates and returns an array of species objects representing
    //      all valid species in the input file
    // Notes:
    //    - Species without names are skipped
    //    - See assignment description for details on the FASTA format
    // Hints:
    //    - Because the bar character ("|") denotes OR, you need to escape it
    //      if you want to use it to split a string, i.e. you can use "\\|" 
    public static Species[] loadSpeciesFile(String filename) {
        Scanner s = null;
        try {
            s = new Scanner(new File(filename));
        } catch(Exception e) {
            System.out.println("Unable to open file:" + filename);
            e.printStackTrace();
            System.exit(1);
        }

        ArrayList<String> Spec = new ArrayList<String>();
        ArrayList<Species> SpeciesList = new ArrayList<Species>();
        String[] Seq;
        String localSpecies = "";
        Species[] Species;
        int lineInc = 0;
        while(s.hasNextLine()) {
            ArrayList<String> line = new ArrayList<String>();
            line = stringToArray(s.nextLine());
            lineInc++;
            //create ArrayList of Species Names
            if (lineInc % 2 == 1) {
                if(line.size() > 6) {
                    Spec.add(line.get(6));
                    localSpecies = line.get(6);
                    //System.out.println(line.size());
                    //System.out.println(localSpecies);
                } //Skip line if invalid input
                else {
                    String skipLine = s.nextLine();
                    skipLine = null;
                    skipLine = s.nextLine();
                    lineInc++;
                    lineInc++;
                    localSpecies = null;
                }
            }
            //If line is a sequence, add to Sequence list
            if (lineInc % 2 == 0) {
                Seq = new String[line.size()];
                for (int i = 0; i < line.size(); i++) {
                    Seq[i] = line.get(i);
                    //System.out.println(Seq[i]);
                }
                //Create species object using localSpecies name and Seq array
                if (localSpecies != null) {
                    Species species = new Species(localSpecies, Seq);
                    SpeciesList.add(species);
                }
                
            }
        }
        //Create and fill array of species objects
        Species = new Species[SpeciesList.size()];
        for (int i = 0; i < SpeciesList.size(); i++) {
            Species[i] = SpeciesList.get(i);
        }
        return Species;
    }
    // getAllDescendantSpecies
    // Pre-conditions:
    //    - node points to a node in a phylogenetic tree structure
    //    - descendants is a non-null reference variable to an empty arraylist object
    // Post-conditions:
    //    - descendants is populated with all species in the subtree rooted at node
    //      in in-/pre-/post-order (they are equivalent here)
    private static void getAllDescendantSpecies(PhyloTreeNode node, java.util.ArrayList<Species> descendants) {
        /*
        if (node == null) {
            return;
        }
        else {
            descendants.add(node.getSpecies());
            descendants.add(getAllDescendantSpecies(node.getLeftChild(), descendants));
            descendants.add(getAllDescendantSpecies(node.getRightChild(), descendants));
        }
        */
        return;
    }
    // findTreeNodeByLabel
    // Pre-conditions:
    //    - node points to a node in a phylogenetic tree structure
    //    - label is the label of a tree node that you intend to locate
    // Post-conditions:
    //    - If no node with the label exists in the subtree, return null
    //    - Else: return the PhyloTreeNode with the specified label 
    // Notes:
    //    - Assumes labels are unique in the tree
    private static PhyloTreeNode findTreeNodeByLabel(PhyloTreeNode node, String label) {
        
        return null;
    }
    // findLeastCommonAncestor
    // Pre-conditions:
    //    - node1 and node2 point to nodes in the phylogenetic tree
    // Post-conditions:
    //    - If node1 or node2 are null, return null
    //    - Else: returns the PhyloTreeNode of their common ancestor 
    //      with the largest depth
     private static PhyloTreeNode findLeastCommonAncestor(PhyloTreeNode node1, PhyloTreeNode node2) {
         //if(node1 == null || node2 == null){
            // return null;
        //}
        //else{
            //
        //}
        return null;
    }

     // stringToArray
    // Preconditions: 
    //  - s is a string of words, each separated by a single space
    // Postconditions:
    //  - An ArrayList is returned containing the words in s
    // Notes:
    //  - Already implemented for you
    public static ArrayList<String> stringToArray(String s) {
        return new ArrayList<String>(java.util.Arrays.asList(s.split("\\|")));
    }
}
