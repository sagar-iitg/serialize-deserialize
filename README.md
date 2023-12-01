# serialize-deserialize

### If your data will be used by only the Java program that generated it: Use serialization

### If your data will be used by other programs: Write a plain-text file

### The serialized file is much harder for humans to read

### FileOutputStreams write bytes to a file.

### ObjectOutputStreams turn objects into data

### When we call writeObject() on the ObjectOutputStream, the object gets pumped into the stream and then moves to the FileOutputStream where it ultimately gets written as bytes to a file.

### When an object is serialized, all the objects it refers to from instance variables are also serialized. And all the objects those objects refer to are serialized. And all the objects those objects refer to are serialized...and the best part is, it happens automatically!

### Serialization saves the entire object graph

### (This is how interfaces always work. If your superclass “IS-A” Serializable, you are too.)

###  If any superclass of a class is serializable, the subclass is automatically serializable even if the subclass doesn’t explicitly declare “implements Serializable.

### Either the entire object graph is serialized correctly or serialization fails.

### If a class I’m using isn’t serializable but there’s no good reason, can I subclass the “bad” class and make the subclass serializable?

### The whole point of serializing an object is so that you can restore it to its original state at some later date, in a different “run” of the JVM (which might not even be the same JVM that was running at the time the object was serialized). Deserialization is a lot like serialization in reverse.


### What about static variables? Are they serialized? No

### Nope. Remember, static means “one per class” not “one per object.”

### 