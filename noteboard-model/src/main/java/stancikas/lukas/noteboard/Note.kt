package stancikas.lukas.noteboard

interface Note {
	val id: Long
	val text: String
	val isDone: Boolean
	val dateCreated: Long
	val dateModified: Long
}
