# Revagenda-Mongo

Revagenda is the name of a demo application I will be building alongside your projects as we go through training topics. This is a client/server app with a spring/mongo backend and an Angular front end. Revagenda is a "to do list" where users can add items which need to be completed. Later they can mark outstanding items as completed, and track work yet to be done. This will involve many of the same technologies as your projects, but built into a different shape. 

### Domain Objects:
 - User - represents a person using Revagenda, also includes auth info.
 - Task - an item to be completed, can be finished or unfinished. Has a description, title, completed flag, and possibly a due date.
 - TaskFile - flat file which contains information about one or more tasks (migrated from an old version?)
   - Specification - the spec for the flat file, indicating field positions and lengths. Only need one spec for Revagenda.

