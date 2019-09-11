package org.komamitsu.mincaml.truffle

import com.oracle.truffle.api.TruffleFile
import java.nio.charset.Charset

class KMCFileDetector : TruffleFile.FileTypeDetector {
    override fun findMimeType(file: TruffleFile): String? {
        return null
    }

    override fun findEncoding(file: TruffleFile): Charset? {
        return null
    }
}