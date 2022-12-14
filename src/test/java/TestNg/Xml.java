package TestNg;

public class Xml {
	
	
	
	/* 
	 
	 >>>[for group testing(for include, exclude)]
	
	<suite name="Suite">
	  <test thread-count="5" name="Test">
	    <groups>                       --------> for group Testing 
	      <run>
	       <include name="Harish"/> -> group Name(included)
	       <exclude name="HP"/>-----------------> group Name(excluded)
	       </run>
	       </groups>
	       <classes>
	       <class name="TestNg.TestNg">
	      </class>
	    </classes>
	   </test> <!-- Test -->
	 </suite> <!-- Suite -->
	 
	 
	
	 >>>[method testing (include,exclude)]
	
	<suite name ="Suite">
	 <test thread-count="5" name="Test">
	 <classes>
	 <class name= "packagename.classname">
	 <methods>                       -------> 
	 <exclude name = "method name"/>
	 </methods>
	 </class>
	 </classes>
	 </test>
	 </suite> 
	 
	 
	 
	 
	 >>>[Groups of Group]
	 
	 <suite name="Suite">
  <test thread-count="5" name="Test">
    <groups>
      <define name ="both">
      <include name="Harish"/>  
      <include name="HP"/>
     </define>
     <run>
     <include name ="both"/>
     </run>
    </groups>
      <classes>
      <class name="TestNg.TestNg">
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
	 
	 
	 
	 
	 
	 */
	
	
	
	
	
	
	
	
	
	
	
}
