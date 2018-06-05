package stancikas.lukas.noteboard

data class Note(val id: Long, val text: String, val isDone: Boolean, val dateCreated: Long, val dateModified: Long)
