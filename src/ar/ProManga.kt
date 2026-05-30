package eu.kanade.tachiyomi.extension.ar.promanga

import eu.kanade.tachiyomi.multisrc.mangastream.MangaStream
import java.text.SimpleDateFormat
import java.util.Locale

class ProManga : MangaStream(
    "Manga Pro",
    "https://procomic.pro",
    "ar",
    SimpleDateFormat("MMMMM dd, yyyy", Locale("ar"))
) {
    override val id: Long = 6848293759283748591L
}
