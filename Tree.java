class Tree{
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree(){
  
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aName, String aType, boolean aFall, String aColor) {

    treeName = aName;
    treeType = aType;
    leavesFall = aFall;
    leafColor = aColor;
  }

  String getName(){
    return treeName;
  }

  String getType(){
    return treeType;
  }

  boolean getFall(){
    return leavesFall;
  }

  String getColor(){
    return leafColor;
  }

  void setName(String theName){
    treeName = theName;
  }

  void setType(String theType){
    treeType = theType;
  }

  void setFall(boolean theFall){
    leavesFall = theFall;
  }

  void setColor(String theColor){
    leafColor = theColor;
  }

  void print(){
    String leavesStatus = "does not";
    if(leavesFall == true){
      leavesStatus = "does";
    }
    else{
      leavesStatus = "does not";
    }
    System.out.println("This is a " + treeName + " tree.");
    
    System.out.println("It is a " + treeType + " and it's leaves are currently " + leafColor + ".");

    System.out.println("It " + leavesStatus + " lose its leaves for the winter." );
  }

}