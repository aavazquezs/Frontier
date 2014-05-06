FRONTIER
========
A geometric constraint solver that supports 3D feature based CAD and assembly.

NOTE: email sitharam@cise.ufl.edu to request any additional information.

Modifications and dates
-----------------------
The FRONTIER software is undergoing continuous transformation. Watch this space for version changes as well as pointers to changes and additions to documentation and publications.

Installation (for unix):
------------------------
NOTE: Currently, to run FRONTIER, you need Maple V or a later version.

- copy the FRONTIER.tar.gz file
- do gunzip FRONTIER.tar.gz
- do tar -xvf FRONTIER.tar

You should now have a directory called FRONTIER-gnu that contains all the source code and documentation.
	(the gnu public license can be found in the documentation index in the documentation directory in the FRONTIER-gnu directory).

The documentation folder within it gives you all documentation about the various modules

Inside the FRONTIER-gnu directory, type `run` (or `./run` depending on your configuration) to start the FRONTIER geometric constraint solver.

Description of FRONTIER's overall strengths 
-----------------------------------
Its organization and components can be found in: "FRONTIER: fully enabling geometric constraints for feature based 3d design and assembly," J. Oung, M. Sitharam, B. Moro, A. Arbree, Proceedings of the ACM Solid Modeling symposium, 2001. [Link to paper](http://www.cise.ufl.edu/~sitharam/shortfrontier.ps) (Full paper in preparation -- watch this space).

See also [J-J. Oung's masters thesis](http://www.cise.ufl.edu/~joung).

Many of FRONTIER's strengths rely on  the degree-of-freedom-graph-based decomposition and recombination method called the Frontier Vertex Algorithm (FA) for geometric constraint systems.  This algorithms applies equally well to 3D, although the sketcher user interface  currently available with FRONTIER is restricted to 2d. FA's advantages, performance, construction and comparison with existing decomposition-recombination methods can be found in the following papers.

1. [Decomposition Plans for Geometric Constraint Systems, Part I: Performance Measures for CAD](http://www.idealibrary.com/links/toc/jsco/31/4/0); Christoph M. Hoffman, Andrew Lomonosov, Meera Sitharam. Journal of Symbolic computation, vol 31, issue 4, pp. 367-408.
2. [Decomposition Plans for Geometric Constraint Problems, Part II: New Algorithms](http://www.idealibrary.com/links/toc/jsco/31/4/0); Christoph M. Hoffman, Andrew Lomonosov, Meera Sitharam. Vol 31, issue 4, pp. 409-427.
3. Geometric constraint decomposition; C. Hoffman, M. Sitharam, A. Lomonosov. In "Geometric Constraint Solving and Applications", Springer Verlag, Edited by Beat Br\" uderlin and Dieter Roller, 1998. 
4. Finding dense subgraphs of constraint graphs; M. Sitharam, C. Hoffman, A. Lomonosov. Constraint Programming '97, Lecture Notes in Computer Science 1330, G. Smolka Ed., Springer Verlag, pp. 463-478, 1997. 
5. Planning Geometric constraint decompositions via graph transformations; C. Hoffman, A. Lomonosov, M. Sitharam, Proceedings of AGTIVE '99 (Graph Transformations with Industrial Relevance), Springer lecture notes, LNCS 1779, eds Nagl, Schurr, Munch, pp. 309-324, 1999. 
6. FRONTIER, a 3d geometric constraint solver Part I: architecture, Sitharam, Oung, Arbree, Kohareswaran. Submitted.
7. FRONTIER, a 3d geometric constraint solver Part II: algorithms; Sitharam, Arbree, Zhou. Submitted.

I/O specifications and further documentation
--------------------------------------------
For each of FRONTIER's four components:

- FUI sketcher (user interface, Java)
- UTU (main program in C++), 
- D(ecomp)R(ecomb)-planner( Frontier vertex algorithm in C++), 
- ESM (equation-solution-manager in C++)

can be found in the documentation folder within the FRONTIER-gnu directory as well as interspersed in the code.

The communication between the Java and C++ programs is achieved using the JavaNativeInterface so that they use the same frep datastructures without having to open and close files. The datastructures are explained in documentation/CCcodedocs/datastructures_overview.txt.

FRONTIER needs access to an algebraic/numeric solver, and currently it uses Maple V (or a later version).
