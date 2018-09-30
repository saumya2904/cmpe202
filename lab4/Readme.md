I chose Observer Design Pattern for the problem. The reason was since the objects in the problem were dependent on the restaurant system
for state change or modifications.

I have following objects in my diagram:
1. Customer: Plays the role of observer and is responsible for sending messages to the restaurant system.
2. Restaurant: This is the subject and will communicate with all the other objects.
3. Table: Plays the role of observer and is responsible for sending messages to the waitlist.
4. Waitlist: Plays the role of observer and is responsible for sending/receiving messages to the restaurant system and update the waitlist accordingly.
