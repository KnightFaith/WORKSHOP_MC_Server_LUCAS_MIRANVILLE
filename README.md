# bsdante
BS-DANTE

Recursive Back-tracker :

 USING  STOWAGE && STACKS-> 
    - STACK 1 : POSITIONS 
	    all visited position are stacked until no more neighbours are available	when all current   neighbours are explored, destack(or pop) their place (off the stack) repeat ops until no more  cells are unexplored.
	
    - stowage 2 : VISITED 
      same as position only difference is pos will not get popped out of stack if no neighbours are available
      
      Quite fast && "simple";
      Perfect for "perfect" maze;

Depth-First search
    -   choose a starting point in the field,
    -   choose a wall(another anchor point) then carve through also randomly choosen non visited adjacent cells or choose the first non visited cell that's next to the cuurent one,
    -   like the rec back_t it will go back  through it's cell until new non-visited one appears,
    -   algo ends when position are back tracked all the way to the starting point 
    more or less based on randomly choosen decision
    could produce more or less complex mazes 
    
Randomized Prim's
  - Start with a wall filled grid
  - Picks a random cell and marks it as part of the maze then adds the wall of adjacent as unvisited (add to a wall list)
  - while wall list not emptied, pick random one. If only one cell out the 2 that it divides is visited mark it and the wall as part of the maze(passage);
  - Then add neighbourings wall to wall's list -> restart
Eller's
  - Makes weird thing and row by row usefull for imperfect maze
  - creates random row and connection to each of 'em
	
