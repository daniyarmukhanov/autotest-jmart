package kz.jmart.autotest.core

import java.io.FileInputStream
import java.io.IOException
import java.util.*

class ConfProperties {
    companion object {
        private lateinit var fileInputStream: FileInputStream
        private lateinit var PROPERTIES: Properties

        fun getProperty(key: String): String? {
            if (!::PROPERTIES.isInitialized) {
                try {
                    fileInputStream = FileInputStream("src/test/kotlin/resources/conf.properties")
                    PROPERTIES = Properties()
                    PROPERTIES.load(fileInputStream)
                } catch (e: IOException) {
                    e.printStackTrace()
                } finally {
                    try {
                        fileInputStream.close()
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            }

            return PROPERTIES.getProperty(key)
        }
    }
}
