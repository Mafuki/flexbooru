package onlymash.flexbooru.data.model.danbooru1

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import onlymash.flexbooru.data.model.common.Tag

@Serializable
data class TagDan1(
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("count")
    val count: Int,
    @SerialName("type")
    val type: Int,
    @SerialName("ambiguous")
    val ambiguous: Boolean
) {
    fun toTag(): Tag {
        return Tag(
            id = id,
            name = name,
            category = type,
            count = count
        )
    }
}