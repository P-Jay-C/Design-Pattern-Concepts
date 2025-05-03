classDiagram
direction BT
class History {
  + History() 
  + save(Momento) void
  + redo() Momento
  + undo() Momento
}

