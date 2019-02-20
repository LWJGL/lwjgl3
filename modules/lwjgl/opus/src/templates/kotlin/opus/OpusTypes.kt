/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus

import org.lwjgl.generator.*

val OPUS_BINDING = simpleBinding(
    Module.OPUS,
    libraryExpression = """Configuration.OPUS_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("opus"))""",
    bundledWithLWJGL = true
)
val OPUS_BINDING_DELEGATE = OPUS_BINDING.delegate("Opus.getLibrary()")

val opus_int16 = IntegerType("opus_int16", PrimitiveMapping.SHORT)
val opus_int32 = IntegerType("opus_int32", PrimitiveMapping.INT)

val OpusEncoder = "OpusEncoder".opaque
val OpusDecoder = "OpusDecoder".opaque
val OpusRepacketizer = "OpusRepacketizer".opaque

val OpusMSEncoder = "OpusMSEncoder".opaque
val OpusMSDecoder = "OpusMSDecoder".opaque

val OpusCustomEncoder = "OpusCustomEncoder".opaque
val OpusCustomDecoder = "OpusCustomDecoder".opaque
val OpusCustomMode = "OpusCustomMode".opaque

val OpusProjectionEncoder = "OpusProjectionEncoder".opaque
val OpusProjectionDecoder = "OpusProjectionDecoder".opaque