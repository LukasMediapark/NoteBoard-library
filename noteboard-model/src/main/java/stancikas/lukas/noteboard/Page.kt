package stancikas.lukas.noteboard

interface Page {
	val id: Long
	val title: String
	val items: List<Note>
	val dateCreated: Long
	val dateModified: Long
}
