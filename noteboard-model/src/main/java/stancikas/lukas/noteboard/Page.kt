package stancikas.lukas.noteboard

data class Page(val title: String, val notes: List<Note>, val dateCreated: Long, val dateEdited: Long)
