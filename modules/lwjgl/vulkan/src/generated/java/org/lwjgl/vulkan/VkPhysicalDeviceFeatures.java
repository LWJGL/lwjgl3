/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceFeatures {
 *     VkBool32 robustBufferAccess;
 *     VkBool32 fullDrawIndexUint32;
 *     VkBool32 imageCubeArray;
 *     VkBool32 independentBlend;
 *     VkBool32 geometryShader;
 *     VkBool32 tessellationShader;
 *     VkBool32 sampleRateShading;
 *     VkBool32 dualSrcBlend;
 *     VkBool32 logicOp;
 *     VkBool32 multiDrawIndirect;
 *     VkBool32 drawIndirectFirstInstance;
 *     VkBool32 depthClamp;
 *     VkBool32 depthBiasClamp;
 *     VkBool32 fillModeNonSolid;
 *     VkBool32 depthBounds;
 *     VkBool32 wideLines;
 *     VkBool32 largePoints;
 *     VkBool32 alphaToOne;
 *     VkBool32 multiViewport;
 *     VkBool32 samplerAnisotropy;
 *     VkBool32 textureCompressionETC2;
 *     VkBool32 textureCompressionASTC_LDR;
 *     VkBool32 textureCompressionBC;
 *     VkBool32 occlusionQueryPrecise;
 *     VkBool32 pipelineStatisticsQuery;
 *     VkBool32 vertexPipelineStoresAndAtomics;
 *     VkBool32 fragmentStoresAndAtomics;
 *     VkBool32 shaderTessellationAndGeometryPointSize;
 *     VkBool32 shaderImageGatherExtended;
 *     VkBool32 shaderStorageImageExtendedFormats;
 *     VkBool32 shaderStorageImageMultisample;
 *     VkBool32 shaderStorageImageReadWithoutFormat;
 *     VkBool32 shaderStorageImageWriteWithoutFormat;
 *     VkBool32 shaderUniformBufferArrayDynamicIndexing;
 *     VkBool32 shaderSampledImageArrayDynamicIndexing;
 *     VkBool32 shaderStorageBufferArrayDynamicIndexing;
 *     VkBool32 shaderStorageImageArrayDynamicIndexing;
 *     VkBool32 shaderClipDistance;
 *     VkBool32 shaderCullDistance;
 *     VkBool32 shaderFloat64;
 *     VkBool32 shaderInt64;
 *     VkBool32 shaderInt16;
 *     VkBool32 shaderResourceResidency;
 *     VkBool32 shaderResourceMinLod;
 *     VkBool32 sparseBinding;
 *     VkBool32 sparseResidencyBuffer;
 *     VkBool32 sparseResidencyImage2D;
 *     VkBool32 sparseResidencyImage3D;
 *     VkBool32 sparseResidency2Samples;
 *     VkBool32 sparseResidency4Samples;
 *     VkBool32 sparseResidency8Samples;
 *     VkBool32 sparseResidency16Samples;
 *     VkBool32 sparseResidencyAliased;
 *     VkBool32 variableMultisampleRate;
 *     VkBool32 inheritedQueries;
 * }}</pre>
 */
public class VkPhysicalDeviceFeatures extends Struct<VkPhysicalDeviceFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ROBUSTBUFFERACCESS,
        FULLDRAWINDEXUINT32,
        IMAGECUBEARRAY,
        INDEPENDENTBLEND,
        GEOMETRYSHADER,
        TESSELLATIONSHADER,
        SAMPLERATESHADING,
        DUALSRCBLEND,
        LOGICOP,
        MULTIDRAWINDIRECT,
        DRAWINDIRECTFIRSTINSTANCE,
        DEPTHCLAMP,
        DEPTHBIASCLAMP,
        FILLMODENONSOLID,
        DEPTHBOUNDS,
        WIDELINES,
        LARGEPOINTS,
        ALPHATOONE,
        MULTIVIEWPORT,
        SAMPLERANISOTROPY,
        TEXTURECOMPRESSIONETC2,
        TEXTURECOMPRESSIONASTC_LDR,
        TEXTURECOMPRESSIONBC,
        OCCLUSIONQUERYPRECISE,
        PIPELINESTATISTICSQUERY,
        VERTEXPIPELINESTORESANDATOMICS,
        FRAGMENTSTORESANDATOMICS,
        SHADERTESSELLATIONANDGEOMETRYPOINTSIZE,
        SHADERIMAGEGATHEREXTENDED,
        SHADERSTORAGEIMAGEEXTENDEDFORMATS,
        SHADERSTORAGEIMAGEMULTISAMPLE,
        SHADERSTORAGEIMAGEREADWITHOUTFORMAT,
        SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT,
        SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING,
        SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING,
        SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING,
        SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING,
        SHADERCLIPDISTANCE,
        SHADERCULLDISTANCE,
        SHADERFLOAT64,
        SHADERINT64,
        SHADERINT16,
        SHADERRESOURCERESIDENCY,
        SHADERRESOURCEMINLOD,
        SPARSEBINDING,
        SPARSERESIDENCYBUFFER,
        SPARSERESIDENCYIMAGE2D,
        SPARSERESIDENCYIMAGE3D,
        SPARSERESIDENCY2SAMPLES,
        SPARSERESIDENCY4SAMPLES,
        SPARSERESIDENCY8SAMPLES,
        SPARSERESIDENCY16SAMPLES,
        SPARSERESIDENCYALIASED,
        VARIABLEMULTISAMPLERATE,
        INHERITEDQUERIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ROBUSTBUFFERACCESS = layout.offsetof(0);
        FULLDRAWINDEXUINT32 = layout.offsetof(1);
        IMAGECUBEARRAY = layout.offsetof(2);
        INDEPENDENTBLEND = layout.offsetof(3);
        GEOMETRYSHADER = layout.offsetof(4);
        TESSELLATIONSHADER = layout.offsetof(5);
        SAMPLERATESHADING = layout.offsetof(6);
        DUALSRCBLEND = layout.offsetof(7);
        LOGICOP = layout.offsetof(8);
        MULTIDRAWINDIRECT = layout.offsetof(9);
        DRAWINDIRECTFIRSTINSTANCE = layout.offsetof(10);
        DEPTHCLAMP = layout.offsetof(11);
        DEPTHBIASCLAMP = layout.offsetof(12);
        FILLMODENONSOLID = layout.offsetof(13);
        DEPTHBOUNDS = layout.offsetof(14);
        WIDELINES = layout.offsetof(15);
        LARGEPOINTS = layout.offsetof(16);
        ALPHATOONE = layout.offsetof(17);
        MULTIVIEWPORT = layout.offsetof(18);
        SAMPLERANISOTROPY = layout.offsetof(19);
        TEXTURECOMPRESSIONETC2 = layout.offsetof(20);
        TEXTURECOMPRESSIONASTC_LDR = layout.offsetof(21);
        TEXTURECOMPRESSIONBC = layout.offsetof(22);
        OCCLUSIONQUERYPRECISE = layout.offsetof(23);
        PIPELINESTATISTICSQUERY = layout.offsetof(24);
        VERTEXPIPELINESTORESANDATOMICS = layout.offsetof(25);
        FRAGMENTSTORESANDATOMICS = layout.offsetof(26);
        SHADERTESSELLATIONANDGEOMETRYPOINTSIZE = layout.offsetof(27);
        SHADERIMAGEGATHEREXTENDED = layout.offsetof(28);
        SHADERSTORAGEIMAGEEXTENDEDFORMATS = layout.offsetof(29);
        SHADERSTORAGEIMAGEMULTISAMPLE = layout.offsetof(30);
        SHADERSTORAGEIMAGEREADWITHOUTFORMAT = layout.offsetof(31);
        SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT = layout.offsetof(32);
        SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING = layout.offsetof(33);
        SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING = layout.offsetof(34);
        SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING = layout.offsetof(35);
        SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING = layout.offsetof(36);
        SHADERCLIPDISTANCE = layout.offsetof(37);
        SHADERCULLDISTANCE = layout.offsetof(38);
        SHADERFLOAT64 = layout.offsetof(39);
        SHADERINT64 = layout.offsetof(40);
        SHADERINT16 = layout.offsetof(41);
        SHADERRESOURCERESIDENCY = layout.offsetof(42);
        SHADERRESOURCEMINLOD = layout.offsetof(43);
        SPARSEBINDING = layout.offsetof(44);
        SPARSERESIDENCYBUFFER = layout.offsetof(45);
        SPARSERESIDENCYIMAGE2D = layout.offsetof(46);
        SPARSERESIDENCYIMAGE3D = layout.offsetof(47);
        SPARSERESIDENCY2SAMPLES = layout.offsetof(48);
        SPARSERESIDENCY4SAMPLES = layout.offsetof(49);
        SPARSERESIDENCY8SAMPLES = layout.offsetof(50);
        SPARSERESIDENCY16SAMPLES = layout.offsetof(51);
        SPARSERESIDENCYALIASED = layout.offsetof(52);
        VARIABLEMULTISAMPLERATE = layout.offsetof(53);
        INHERITEDQUERIES = layout.offsetof(54);
    }

    protected VkPhysicalDeviceFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFeatures(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code robustBufferAccess} field. */
    @NativeType("VkBool32")
    public boolean robustBufferAccess() { return nrobustBufferAccess(address()) != 0; }
    /** @return the value of the {@code fullDrawIndexUint32} field. */
    @NativeType("VkBool32")
    public boolean fullDrawIndexUint32() { return nfullDrawIndexUint32(address()) != 0; }
    /** @return the value of the {@code imageCubeArray} field. */
    @NativeType("VkBool32")
    public boolean imageCubeArray() { return nimageCubeArray(address()) != 0; }
    /** @return the value of the {@code independentBlend} field. */
    @NativeType("VkBool32")
    public boolean independentBlend() { return nindependentBlend(address()) != 0; }
    /** @return the value of the {@code geometryShader} field. */
    @NativeType("VkBool32")
    public boolean geometryShader() { return ngeometryShader(address()) != 0; }
    /** @return the value of the {@code tessellationShader} field. */
    @NativeType("VkBool32")
    public boolean tessellationShader() { return ntessellationShader(address()) != 0; }
    /** @return the value of the {@code sampleRateShading} field. */
    @NativeType("VkBool32")
    public boolean sampleRateShading() { return nsampleRateShading(address()) != 0; }
    /** @return the value of the {@code dualSrcBlend} field. */
    @NativeType("VkBool32")
    public boolean dualSrcBlend() { return ndualSrcBlend(address()) != 0; }
    /** @return the value of the {@code logicOp} field. */
    @NativeType("VkBool32")
    public boolean logicOp() { return nlogicOp(address()) != 0; }
    /** @return the value of the {@code multiDrawIndirect} field. */
    @NativeType("VkBool32")
    public boolean multiDrawIndirect() { return nmultiDrawIndirect(address()) != 0; }
    /** @return the value of the {@code drawIndirectFirstInstance} field. */
    @NativeType("VkBool32")
    public boolean drawIndirectFirstInstance() { return ndrawIndirectFirstInstance(address()) != 0; }
    /** @return the value of the {@code depthClamp} field. */
    @NativeType("VkBool32")
    public boolean depthClamp() { return ndepthClamp(address()) != 0; }
    /** @return the value of the {@code depthBiasClamp} field. */
    @NativeType("VkBool32")
    public boolean depthBiasClamp() { return ndepthBiasClamp(address()) != 0; }
    /** @return the value of the {@code fillModeNonSolid} field. */
    @NativeType("VkBool32")
    public boolean fillModeNonSolid() { return nfillModeNonSolid(address()) != 0; }
    /** @return the value of the {@code depthBounds} field. */
    @NativeType("VkBool32")
    public boolean depthBounds() { return ndepthBounds(address()) != 0; }
    /** @return the value of the {@code wideLines} field. */
    @NativeType("VkBool32")
    public boolean wideLines() { return nwideLines(address()) != 0; }
    /** @return the value of the {@code largePoints} field. */
    @NativeType("VkBool32")
    public boolean largePoints() { return nlargePoints(address()) != 0; }
    /** @return the value of the {@code alphaToOne} field. */
    @NativeType("VkBool32")
    public boolean alphaToOne() { return nalphaToOne(address()) != 0; }
    /** @return the value of the {@code multiViewport} field. */
    @NativeType("VkBool32")
    public boolean multiViewport() { return nmultiViewport(address()) != 0; }
    /** @return the value of the {@code samplerAnisotropy} field. */
    @NativeType("VkBool32")
    public boolean samplerAnisotropy() { return nsamplerAnisotropy(address()) != 0; }
    /** @return the value of the {@code textureCompressionETC2} field. */
    @NativeType("VkBool32")
    public boolean textureCompressionETC2() { return ntextureCompressionETC2(address()) != 0; }
    /** @return the value of the {@code textureCompressionASTC_LDR} field. */
    @NativeType("VkBool32")
    public boolean textureCompressionASTC_LDR() { return ntextureCompressionASTC_LDR(address()) != 0; }
    /** @return the value of the {@code textureCompressionBC} field. */
    @NativeType("VkBool32")
    public boolean textureCompressionBC() { return ntextureCompressionBC(address()) != 0; }
    /** @return the value of the {@code occlusionQueryPrecise} field. */
    @NativeType("VkBool32")
    public boolean occlusionQueryPrecise() { return nocclusionQueryPrecise(address()) != 0; }
    /** @return the value of the {@code pipelineStatisticsQuery} field. */
    @NativeType("VkBool32")
    public boolean pipelineStatisticsQuery() { return npipelineStatisticsQuery(address()) != 0; }
    /** @return the value of the {@code vertexPipelineStoresAndAtomics} field. */
    @NativeType("VkBool32")
    public boolean vertexPipelineStoresAndAtomics() { return nvertexPipelineStoresAndAtomics(address()) != 0; }
    /** @return the value of the {@code fragmentStoresAndAtomics} field. */
    @NativeType("VkBool32")
    public boolean fragmentStoresAndAtomics() { return nfragmentStoresAndAtomics(address()) != 0; }
    /** @return the value of the {@code shaderTessellationAndGeometryPointSize} field. */
    @NativeType("VkBool32")
    public boolean shaderTessellationAndGeometryPointSize() { return nshaderTessellationAndGeometryPointSize(address()) != 0; }
    /** @return the value of the {@code shaderImageGatherExtended} field. */
    @NativeType("VkBool32")
    public boolean shaderImageGatherExtended() { return nshaderImageGatherExtended(address()) != 0; }
    /** @return the value of the {@code shaderStorageImageExtendedFormats} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageExtendedFormats() { return nshaderStorageImageExtendedFormats(address()) != 0; }
    /** @return the value of the {@code shaderStorageImageMultisample} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageMultisample() { return nshaderStorageImageMultisample(address()) != 0; }
    /** @return the value of the {@code shaderStorageImageReadWithoutFormat} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageReadWithoutFormat() { return nshaderStorageImageReadWithoutFormat(address()) != 0; }
    /** @return the value of the {@code shaderStorageImageWriteWithoutFormat} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageWriteWithoutFormat() { return nshaderStorageImageWriteWithoutFormat(address()) != 0; }
    /** @return the value of the {@code shaderUniformBufferArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayDynamicIndexing() { return nshaderUniformBufferArrayDynamicIndexing(address()) != 0; }
    /** @return the value of the {@code shaderSampledImageArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayDynamicIndexing() { return nshaderSampledImageArrayDynamicIndexing(address()) != 0; }
    /** @return the value of the {@code shaderStorageBufferArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayDynamicIndexing() { return nshaderStorageBufferArrayDynamicIndexing(address()) != 0; }
    /** @return the value of the {@code shaderStorageImageArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayDynamicIndexing() { return nshaderStorageImageArrayDynamicIndexing(address()) != 0; }
    /** @return the value of the {@code shaderClipDistance} field. */
    @NativeType("VkBool32")
    public boolean shaderClipDistance() { return nshaderClipDistance(address()) != 0; }
    /** @return the value of the {@code shaderCullDistance} field. */
    @NativeType("VkBool32")
    public boolean shaderCullDistance() { return nshaderCullDistance(address()) != 0; }
    /** @return the value of the {@code shaderFloat64} field. */
    @NativeType("VkBool32")
    public boolean shaderFloat64() { return nshaderFloat64(address()) != 0; }
    /** @return the value of the {@code shaderInt64} field. */
    @NativeType("VkBool32")
    public boolean shaderInt64() { return nshaderInt64(address()) != 0; }
    /** @return the value of the {@code shaderInt16} field. */
    @NativeType("VkBool32")
    public boolean shaderInt16() { return nshaderInt16(address()) != 0; }
    /** @return the value of the {@code shaderResourceResidency} field. */
    @NativeType("VkBool32")
    public boolean shaderResourceResidency() { return nshaderResourceResidency(address()) != 0; }
    /** @return the value of the {@code shaderResourceMinLod} field. */
    @NativeType("VkBool32")
    public boolean shaderResourceMinLod() { return nshaderResourceMinLod(address()) != 0; }
    /** @return the value of the {@code sparseBinding} field. */
    @NativeType("VkBool32")
    public boolean sparseBinding() { return nsparseBinding(address()) != 0; }
    /** @return the value of the {@code sparseResidencyBuffer} field. */
    @NativeType("VkBool32")
    public boolean sparseResidencyBuffer() { return nsparseResidencyBuffer(address()) != 0; }
    /** @return the value of the {@code sparseResidencyImage2D} field. */
    @NativeType("VkBool32")
    public boolean sparseResidencyImage2D() { return nsparseResidencyImage2D(address()) != 0; }
    /** @return the value of the {@code sparseResidencyImage3D} field. */
    @NativeType("VkBool32")
    public boolean sparseResidencyImage3D() { return nsparseResidencyImage3D(address()) != 0; }
    /** @return the value of the {@code sparseResidency2Samples} field. */
    @NativeType("VkBool32")
    public boolean sparseResidency2Samples() { return nsparseResidency2Samples(address()) != 0; }
    /** @return the value of the {@code sparseResidency4Samples} field. */
    @NativeType("VkBool32")
    public boolean sparseResidency4Samples() { return nsparseResidency4Samples(address()) != 0; }
    /** @return the value of the {@code sparseResidency8Samples} field. */
    @NativeType("VkBool32")
    public boolean sparseResidency8Samples() { return nsparseResidency8Samples(address()) != 0; }
    /** @return the value of the {@code sparseResidency16Samples} field. */
    @NativeType("VkBool32")
    public boolean sparseResidency16Samples() { return nsparseResidency16Samples(address()) != 0; }
    /** @return the value of the {@code sparseResidencyAliased} field. */
    @NativeType("VkBool32")
    public boolean sparseResidencyAliased() { return nsparseResidencyAliased(address()) != 0; }
    /** @return the value of the {@code variableMultisampleRate} field. */
    @NativeType("VkBool32")
    public boolean variableMultisampleRate() { return nvariableMultisampleRate(address()) != 0; }
    /** @return the value of the {@code inheritedQueries} field. */
    @NativeType("VkBool32")
    public boolean inheritedQueries() { return ninheritedQueries(address()) != 0; }

    /** Sets the specified value to the {@code robustBufferAccess} field. */
    public VkPhysicalDeviceFeatures robustBufferAccess(@NativeType("VkBool32") boolean value) { nrobustBufferAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fullDrawIndexUint32} field. */
    public VkPhysicalDeviceFeatures fullDrawIndexUint32(@NativeType("VkBool32") boolean value) { nfullDrawIndexUint32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code imageCubeArray} field. */
    public VkPhysicalDeviceFeatures imageCubeArray(@NativeType("VkBool32") boolean value) { nimageCubeArray(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code independentBlend} field. */
    public VkPhysicalDeviceFeatures independentBlend(@NativeType("VkBool32") boolean value) { nindependentBlend(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code geometryShader} field. */
    public VkPhysicalDeviceFeatures geometryShader(@NativeType("VkBool32") boolean value) { ngeometryShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tessellationShader} field. */
    public VkPhysicalDeviceFeatures tessellationShader(@NativeType("VkBool32") boolean value) { ntessellationShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sampleRateShading} field. */
    public VkPhysicalDeviceFeatures sampleRateShading(@NativeType("VkBool32") boolean value) { nsampleRateShading(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dualSrcBlend} field. */
    public VkPhysicalDeviceFeatures dualSrcBlend(@NativeType("VkBool32") boolean value) { ndualSrcBlend(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code logicOp} field. */
    public VkPhysicalDeviceFeatures logicOp(@NativeType("VkBool32") boolean value) { nlogicOp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiDrawIndirect} field. */
    public VkPhysicalDeviceFeatures multiDrawIndirect(@NativeType("VkBool32") boolean value) { nmultiDrawIndirect(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code drawIndirectFirstInstance} field. */
    public VkPhysicalDeviceFeatures drawIndirectFirstInstance(@NativeType("VkBool32") boolean value) { ndrawIndirectFirstInstance(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code depthClamp} field. */
    public VkPhysicalDeviceFeatures depthClamp(@NativeType("VkBool32") boolean value) { ndepthClamp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code depthBiasClamp} field. */
    public VkPhysicalDeviceFeatures depthBiasClamp(@NativeType("VkBool32") boolean value) { ndepthBiasClamp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fillModeNonSolid} field. */
    public VkPhysicalDeviceFeatures fillModeNonSolid(@NativeType("VkBool32") boolean value) { nfillModeNonSolid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code depthBounds} field. */
    public VkPhysicalDeviceFeatures depthBounds(@NativeType("VkBool32") boolean value) { ndepthBounds(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code wideLines} field. */
    public VkPhysicalDeviceFeatures wideLines(@NativeType("VkBool32") boolean value) { nwideLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code largePoints} field. */
    public VkPhysicalDeviceFeatures largePoints(@NativeType("VkBool32") boolean value) { nlargePoints(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code alphaToOne} field. */
    public VkPhysicalDeviceFeatures alphaToOne(@NativeType("VkBool32") boolean value) { nalphaToOne(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiViewport} field. */
    public VkPhysicalDeviceFeatures multiViewport(@NativeType("VkBool32") boolean value) { nmultiViewport(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code samplerAnisotropy} field. */
    public VkPhysicalDeviceFeatures samplerAnisotropy(@NativeType("VkBool32") boolean value) { nsamplerAnisotropy(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code textureCompressionETC2} field. */
    public VkPhysicalDeviceFeatures textureCompressionETC2(@NativeType("VkBool32") boolean value) { ntextureCompressionETC2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code textureCompressionASTC_LDR} field. */
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(@NativeType("VkBool32") boolean value) { ntextureCompressionASTC_LDR(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code textureCompressionBC} field. */
    public VkPhysicalDeviceFeatures textureCompressionBC(@NativeType("VkBool32") boolean value) { ntextureCompressionBC(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code occlusionQueryPrecise} field. */
    public VkPhysicalDeviceFeatures occlusionQueryPrecise(@NativeType("VkBool32") boolean value) { nocclusionQueryPrecise(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pipelineStatisticsQuery} field. */
    public VkPhysicalDeviceFeatures pipelineStatisticsQuery(@NativeType("VkBool32") boolean value) { npipelineStatisticsQuery(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vertexPipelineStoresAndAtomics} field. */
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(@NativeType("VkBool32") boolean value) { nvertexPipelineStoresAndAtomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fragmentStoresAndAtomics} field. */
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(@NativeType("VkBool32") boolean value) { nfragmentStoresAndAtomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderTessellationAndGeometryPointSize} field. */
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(@NativeType("VkBool32") boolean value) { nshaderTessellationAndGeometryPointSize(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderImageGatherExtended} field. */
    public VkPhysicalDeviceFeatures shaderImageGatherExtended(@NativeType("VkBool32") boolean value) { nshaderImageGatherExtended(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageExtendedFormats} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(@NativeType("VkBool32") boolean value) { nshaderStorageImageExtendedFormats(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageMultisample} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageMultisample(@NativeType("VkBool32") boolean value) { nshaderStorageImageMultisample(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageReadWithoutFormat} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(@NativeType("VkBool32") boolean value) { nshaderStorageImageReadWithoutFormat(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageWriteWithoutFormat} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(@NativeType("VkBool32") boolean value) { nshaderStorageImageWriteWithoutFormat(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSampledImageArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderSampledImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderClipDistance} field. */
    public VkPhysicalDeviceFeatures shaderClipDistance(@NativeType("VkBool32") boolean value) { nshaderClipDistance(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderCullDistance} field. */
    public VkPhysicalDeviceFeatures shaderCullDistance(@NativeType("VkBool32") boolean value) { nshaderCullDistance(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderFloat64} field. */
    public VkPhysicalDeviceFeatures shaderFloat64(@NativeType("VkBool32") boolean value) { nshaderFloat64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInt64} field. */
    public VkPhysicalDeviceFeatures shaderInt64(@NativeType("VkBool32") boolean value) { nshaderInt64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInt16} field. */
    public VkPhysicalDeviceFeatures shaderInt16(@NativeType("VkBool32") boolean value) { nshaderInt16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderResourceResidency} field. */
    public VkPhysicalDeviceFeatures shaderResourceResidency(@NativeType("VkBool32") boolean value) { nshaderResourceResidency(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderResourceMinLod} field. */
    public VkPhysicalDeviceFeatures shaderResourceMinLod(@NativeType("VkBool32") boolean value) { nshaderResourceMinLod(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseBinding} field. */
    public VkPhysicalDeviceFeatures sparseBinding(@NativeType("VkBool32") boolean value) { nsparseBinding(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidencyBuffer} field. */
    public VkPhysicalDeviceFeatures sparseResidencyBuffer(@NativeType("VkBool32") boolean value) { nsparseResidencyBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidencyImage2D} field. */
    public VkPhysicalDeviceFeatures sparseResidencyImage2D(@NativeType("VkBool32") boolean value) { nsparseResidencyImage2D(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidencyImage3D} field. */
    public VkPhysicalDeviceFeatures sparseResidencyImage3D(@NativeType("VkBool32") boolean value) { nsparseResidencyImage3D(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidency2Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency2Samples(@NativeType("VkBool32") boolean value) { nsparseResidency2Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidency4Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency4Samples(@NativeType("VkBool32") boolean value) { nsparseResidency4Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidency8Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency8Samples(@NativeType("VkBool32") boolean value) { nsparseResidency8Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidency16Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency16Samples(@NativeType("VkBool32") boolean value) { nsparseResidency16Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseResidencyAliased} field. */
    public VkPhysicalDeviceFeatures sparseResidencyAliased(@NativeType("VkBool32") boolean value) { nsparseResidencyAliased(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code variableMultisampleRate} field. */
    public VkPhysicalDeviceFeatures variableMultisampleRate(@NativeType("VkBool32") boolean value) { nvariableMultisampleRate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code inheritedQueries} field. */
    public VkPhysicalDeviceFeatures inheritedQueries(@NativeType("VkBool32") boolean value) { ninheritedQueries(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFeatures set(
        boolean robustBufferAccess,
        boolean fullDrawIndexUint32,
        boolean imageCubeArray,
        boolean independentBlend,
        boolean geometryShader,
        boolean tessellationShader,
        boolean sampleRateShading,
        boolean dualSrcBlend,
        boolean logicOp,
        boolean multiDrawIndirect,
        boolean drawIndirectFirstInstance,
        boolean depthClamp,
        boolean depthBiasClamp,
        boolean fillModeNonSolid,
        boolean depthBounds,
        boolean wideLines,
        boolean largePoints,
        boolean alphaToOne,
        boolean multiViewport,
        boolean samplerAnisotropy,
        boolean textureCompressionETC2,
        boolean textureCompressionASTC_LDR,
        boolean textureCompressionBC,
        boolean occlusionQueryPrecise,
        boolean pipelineStatisticsQuery,
        boolean vertexPipelineStoresAndAtomics,
        boolean fragmentStoresAndAtomics,
        boolean shaderTessellationAndGeometryPointSize,
        boolean shaderImageGatherExtended,
        boolean shaderStorageImageExtendedFormats,
        boolean shaderStorageImageMultisample,
        boolean shaderStorageImageReadWithoutFormat,
        boolean shaderStorageImageWriteWithoutFormat,
        boolean shaderUniformBufferArrayDynamicIndexing,
        boolean shaderSampledImageArrayDynamicIndexing,
        boolean shaderStorageBufferArrayDynamicIndexing,
        boolean shaderStorageImageArrayDynamicIndexing,
        boolean shaderClipDistance,
        boolean shaderCullDistance,
        boolean shaderFloat64,
        boolean shaderInt64,
        boolean shaderInt16,
        boolean shaderResourceResidency,
        boolean shaderResourceMinLod,
        boolean sparseBinding,
        boolean sparseResidencyBuffer,
        boolean sparseResidencyImage2D,
        boolean sparseResidencyImage3D,
        boolean sparseResidency2Samples,
        boolean sparseResidency4Samples,
        boolean sparseResidency8Samples,
        boolean sparseResidency16Samples,
        boolean sparseResidencyAliased,
        boolean variableMultisampleRate,
        boolean inheritedQueries
    ) {
        robustBufferAccess(robustBufferAccess);
        fullDrawIndexUint32(fullDrawIndexUint32);
        imageCubeArray(imageCubeArray);
        independentBlend(independentBlend);
        geometryShader(geometryShader);
        tessellationShader(tessellationShader);
        sampleRateShading(sampleRateShading);
        dualSrcBlend(dualSrcBlend);
        logicOp(logicOp);
        multiDrawIndirect(multiDrawIndirect);
        drawIndirectFirstInstance(drawIndirectFirstInstance);
        depthClamp(depthClamp);
        depthBiasClamp(depthBiasClamp);
        fillModeNonSolid(fillModeNonSolid);
        depthBounds(depthBounds);
        wideLines(wideLines);
        largePoints(largePoints);
        alphaToOne(alphaToOne);
        multiViewport(multiViewport);
        samplerAnisotropy(samplerAnisotropy);
        textureCompressionETC2(textureCompressionETC2);
        textureCompressionASTC_LDR(textureCompressionASTC_LDR);
        textureCompressionBC(textureCompressionBC);
        occlusionQueryPrecise(occlusionQueryPrecise);
        pipelineStatisticsQuery(pipelineStatisticsQuery);
        vertexPipelineStoresAndAtomics(vertexPipelineStoresAndAtomics);
        fragmentStoresAndAtomics(fragmentStoresAndAtomics);
        shaderTessellationAndGeometryPointSize(shaderTessellationAndGeometryPointSize);
        shaderImageGatherExtended(shaderImageGatherExtended);
        shaderStorageImageExtendedFormats(shaderStorageImageExtendedFormats);
        shaderStorageImageMultisample(shaderStorageImageMultisample);
        shaderStorageImageReadWithoutFormat(shaderStorageImageReadWithoutFormat);
        shaderStorageImageWriteWithoutFormat(shaderStorageImageWriteWithoutFormat);
        shaderUniformBufferArrayDynamicIndexing(shaderUniformBufferArrayDynamicIndexing);
        shaderSampledImageArrayDynamicIndexing(shaderSampledImageArrayDynamicIndexing);
        shaderStorageBufferArrayDynamicIndexing(shaderStorageBufferArrayDynamicIndexing);
        shaderStorageImageArrayDynamicIndexing(shaderStorageImageArrayDynamicIndexing);
        shaderClipDistance(shaderClipDistance);
        shaderCullDistance(shaderCullDistance);
        shaderFloat64(shaderFloat64);
        shaderInt64(shaderInt64);
        shaderInt16(shaderInt16);
        shaderResourceResidency(shaderResourceResidency);
        shaderResourceMinLod(shaderResourceMinLod);
        sparseBinding(sparseBinding);
        sparseResidencyBuffer(sparseResidencyBuffer);
        sparseResidencyImage2D(sparseResidencyImage2D);
        sparseResidencyImage3D(sparseResidencyImage3D);
        sparseResidency2Samples(sparseResidency2Samples);
        sparseResidency4Samples(sparseResidency4Samples);
        sparseResidency8Samples(sparseResidency8Samples);
        sparseResidency16Samples(sparseResidency16Samples);
        sparseResidencyAliased(sparseResidencyAliased);
        variableMultisampleRate(variableMultisampleRate);
        inheritedQueries(inheritedQueries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFeatures set(VkPhysicalDeviceFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures malloc() {
        return new VkPhysicalDeviceFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures calloc() {
        return new VkPhysicalDeviceFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceFeatures create(long address) {
        return new VkPhysicalDeviceFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #robustBufferAccess}. */
    public static int nrobustBufferAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS); }
    /** Unsafe version of {@link #fullDrawIndexUint32}. */
    public static int nfullDrawIndexUint32(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32); }
    /** Unsafe version of {@link #imageCubeArray}. */
    public static int nimageCubeArray(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.IMAGECUBEARRAY); }
    /** Unsafe version of {@link #independentBlend}. */
    public static int nindependentBlend(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.INDEPENDENTBLEND); }
    /** Unsafe version of {@link #geometryShader}. */
    public static int ngeometryShader(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.GEOMETRYSHADER); }
    /** Unsafe version of {@link #tessellationShader}. */
    public static int ntessellationShader(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TESSELLATIONSHADER); }
    /** Unsafe version of {@link #sampleRateShading}. */
    public static int nsampleRateShading(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SAMPLERATESHADING); }
    /** Unsafe version of {@link #dualSrcBlend}. */
    public static int ndualSrcBlend(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DUALSRCBLEND); }
    /** Unsafe version of {@link #logicOp}. */
    public static int nlogicOp(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.LOGICOP); }
    /** Unsafe version of {@link #multiDrawIndirect}. */
    public static int nmultiDrawIndirect(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT); }
    /** Unsafe version of {@link #drawIndirectFirstInstance}. */
    public static int ndrawIndirectFirstInstance(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE); }
    /** Unsafe version of {@link #depthClamp}. */
    public static int ndepthClamp(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DEPTHCLAMP); }
    /** Unsafe version of {@link #depthBiasClamp}. */
    public static int ndepthBiasClamp(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DEPTHBIASCLAMP); }
    /** Unsafe version of {@link #fillModeNonSolid}. */
    public static int nfillModeNonSolid(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.FILLMODENONSOLID); }
    /** Unsafe version of {@link #depthBounds}. */
    public static int ndepthBounds(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.DEPTHBOUNDS); }
    /** Unsafe version of {@link #wideLines}. */
    public static int nwideLines(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.WIDELINES); }
    /** Unsafe version of {@link #largePoints}. */
    public static int nlargePoints(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.LARGEPOINTS); }
    /** Unsafe version of {@link #alphaToOne}. */
    public static int nalphaToOne(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.ALPHATOONE); }
    /** Unsafe version of {@link #multiViewport}. */
    public static int nmultiViewport(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.MULTIVIEWPORT); }
    /** Unsafe version of {@link #samplerAnisotropy}. */
    public static int nsamplerAnisotropy(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SAMPLERANISOTROPY); }
    /** Unsafe version of {@link #textureCompressionETC2}. */
    public static int ntextureCompressionETC2(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2); }
    /** Unsafe version of {@link #textureCompressionASTC_LDR}. */
    public static int ntextureCompressionASTC_LDR(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR); }
    /** Unsafe version of {@link #textureCompressionBC}. */
    public static int ntextureCompressionBC(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC); }
    /** Unsafe version of {@link #occlusionQueryPrecise}. */
    public static int nocclusionQueryPrecise(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE); }
    /** Unsafe version of {@link #pipelineStatisticsQuery}. */
    public static int npipelineStatisticsQuery(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY); }
    /** Unsafe version of {@link #vertexPipelineStoresAndAtomics}. */
    public static int nvertexPipelineStoresAndAtomics(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS); }
    /** Unsafe version of {@link #fragmentStoresAndAtomics}. */
    public static int nfragmentStoresAndAtomics(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS); }
    /** Unsafe version of {@link #shaderTessellationAndGeometryPointSize}. */
    public static int nshaderTessellationAndGeometryPointSize(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE); }
    /** Unsafe version of {@link #shaderImageGatherExtended}. */
    public static int nshaderImageGatherExtended(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED); }
    /** Unsafe version of {@link #shaderStorageImageExtendedFormats}. */
    public static int nshaderStorageImageExtendedFormats(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS); }
    /** Unsafe version of {@link #shaderStorageImageMultisample}. */
    public static int nshaderStorageImageMultisample(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE); }
    /** Unsafe version of {@link #shaderStorageImageReadWithoutFormat}. */
    public static int nshaderStorageImageReadWithoutFormat(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT); }
    /** Unsafe version of {@link #shaderStorageImageWriteWithoutFormat}. */
    public static int nshaderStorageImageWriteWithoutFormat(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT); }
    /** Unsafe version of {@link #shaderUniformBufferArrayDynamicIndexing}. */
    public static int nshaderUniformBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderSampledImageArrayDynamicIndexing}. */
    public static int nshaderSampledImageArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageBufferArrayDynamicIndexing}. */
    public static int nshaderStorageBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageImageArrayDynamicIndexing}. */
    public static int nshaderStorageImageArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderClipDistance}. */
    public static int nshaderClipDistance(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE); }
    /** Unsafe version of {@link #shaderCullDistance}. */
    public static int nshaderCullDistance(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERCULLDISTANCE); }
    /** Unsafe version of {@link #shaderFloat64}. */
    public static int nshaderFloat64(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERFLOAT64); }
    /** Unsafe version of {@link #shaderInt64}. */
    public static int nshaderInt64(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERINT64); }
    /** Unsafe version of {@link #shaderInt16}. */
    public static int nshaderInt16(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERINT16); }
    /** Unsafe version of {@link #shaderResourceResidency}. */
    public static int nshaderResourceResidency(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY); }
    /** Unsafe version of {@link #shaderResourceMinLod}. */
    public static int nshaderResourceMinLod(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD); }
    /** Unsafe version of {@link #sparseBinding}. */
    public static int nsparseBinding(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSEBINDING); }
    /** Unsafe version of {@link #sparseResidencyBuffer}. */
    public static int nsparseResidencyBuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER); }
    /** Unsafe version of {@link #sparseResidencyImage2D}. */
    public static int nsparseResidencyImage2D(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D); }
    /** Unsafe version of {@link #sparseResidencyImage3D}. */
    public static int nsparseResidencyImage3D(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D); }
    /** Unsafe version of {@link #sparseResidency2Samples}. */
    public static int nsparseResidency2Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES); }
    /** Unsafe version of {@link #sparseResidency4Samples}. */
    public static int nsparseResidency4Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES); }
    /** Unsafe version of {@link #sparseResidency8Samples}. */
    public static int nsparseResidency8Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES); }
    /** Unsafe version of {@link #sparseResidency16Samples}. */
    public static int nsparseResidency16Samples(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES); }
    /** Unsafe version of {@link #sparseResidencyAliased}. */
    public static int nsparseResidencyAliased(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED); }
    /** Unsafe version of {@link #variableMultisampleRate}. */
    public static int nvariableMultisampleRate(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE); }
    /** Unsafe version of {@link #inheritedQueries}. */
    public static int ninheritedQueries(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures.INHERITEDQUERIES); }

    /** Unsafe version of {@link #robustBufferAccess(boolean) robustBufferAccess}. */
    public static void nrobustBufferAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS, value); }
    /** Unsafe version of {@link #fullDrawIndexUint32(boolean) fullDrawIndexUint32}. */
    public static void nfullDrawIndexUint32(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32, value); }
    /** Unsafe version of {@link #imageCubeArray(boolean) imageCubeArray}. */
    public static void nimageCubeArray(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.IMAGECUBEARRAY, value); }
    /** Unsafe version of {@link #independentBlend(boolean) independentBlend}. */
    public static void nindependentBlend(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.INDEPENDENTBLEND, value); }
    /** Unsafe version of {@link #geometryShader(boolean) geometryShader}. */
    public static void ngeometryShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.GEOMETRYSHADER, value); }
    /** Unsafe version of {@link #tessellationShader(boolean) tessellationShader}. */
    public static void ntessellationShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TESSELLATIONSHADER, value); }
    /** Unsafe version of {@link #sampleRateShading(boolean) sampleRateShading}. */
    public static void nsampleRateShading(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SAMPLERATESHADING, value); }
    /** Unsafe version of {@link #dualSrcBlend(boolean) dualSrcBlend}. */
    public static void ndualSrcBlend(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DUALSRCBLEND, value); }
    /** Unsafe version of {@link #logicOp(boolean) logicOp}. */
    public static void nlogicOp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.LOGICOP, value); }
    /** Unsafe version of {@link #multiDrawIndirect(boolean) multiDrawIndirect}. */
    public static void nmultiDrawIndirect(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT, value); }
    /** Unsafe version of {@link #drawIndirectFirstInstance(boolean) drawIndirectFirstInstance}. */
    public static void ndrawIndirectFirstInstance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE, value); }
    /** Unsafe version of {@link #depthClamp(boolean) depthClamp}. */
    public static void ndepthClamp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DEPTHCLAMP, value); }
    /** Unsafe version of {@link #depthBiasClamp(boolean) depthBiasClamp}. */
    public static void ndepthBiasClamp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DEPTHBIASCLAMP, value); }
    /** Unsafe version of {@link #fillModeNonSolid(boolean) fillModeNonSolid}. */
    public static void nfillModeNonSolid(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.FILLMODENONSOLID, value); }
    /** Unsafe version of {@link #depthBounds(boolean) depthBounds}. */
    public static void ndepthBounds(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.DEPTHBOUNDS, value); }
    /** Unsafe version of {@link #wideLines(boolean) wideLines}. */
    public static void nwideLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.WIDELINES, value); }
    /** Unsafe version of {@link #largePoints(boolean) largePoints}. */
    public static void nlargePoints(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.LARGEPOINTS, value); }
    /** Unsafe version of {@link #alphaToOne(boolean) alphaToOne}. */
    public static void nalphaToOne(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.ALPHATOONE, value); }
    /** Unsafe version of {@link #multiViewport(boolean) multiViewport}. */
    public static void nmultiViewport(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.MULTIVIEWPORT, value); }
    /** Unsafe version of {@link #samplerAnisotropy(boolean) samplerAnisotropy}. */
    public static void nsamplerAnisotropy(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SAMPLERANISOTROPY, value); }
    /** Unsafe version of {@link #textureCompressionETC2(boolean) textureCompressionETC2}. */
    public static void ntextureCompressionETC2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2, value); }
    /** Unsafe version of {@link #textureCompressionASTC_LDR(boolean) textureCompressionASTC_LDR}. */
    public static void ntextureCompressionASTC_LDR(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR, value); }
    /** Unsafe version of {@link #textureCompressionBC(boolean) textureCompressionBC}. */
    public static void ntextureCompressionBC(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC, value); }
    /** Unsafe version of {@link #occlusionQueryPrecise(boolean) occlusionQueryPrecise}. */
    public static void nocclusionQueryPrecise(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE, value); }
    /** Unsafe version of {@link #pipelineStatisticsQuery(boolean) pipelineStatisticsQuery}. */
    public static void npipelineStatisticsQuery(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY, value); }
    /** Unsafe version of {@link #vertexPipelineStoresAndAtomics(boolean) vertexPipelineStoresAndAtomics}. */
    public static void nvertexPipelineStoresAndAtomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS, value); }
    /** Unsafe version of {@link #fragmentStoresAndAtomics(boolean) fragmentStoresAndAtomics}. */
    public static void nfragmentStoresAndAtomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS, value); }
    /** Unsafe version of {@link #shaderTessellationAndGeometryPointSize(boolean) shaderTessellationAndGeometryPointSize}. */
    public static void nshaderTessellationAndGeometryPointSize(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE, value); }
    /** Unsafe version of {@link #shaderImageGatherExtended(boolean) shaderImageGatherExtended}. */
    public static void nshaderImageGatherExtended(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED, value); }
    /** Unsafe version of {@link #shaderStorageImageExtendedFormats(boolean) shaderStorageImageExtendedFormats}. */
    public static void nshaderStorageImageExtendedFormats(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS, value); }
    /** Unsafe version of {@link #shaderStorageImageMultisample(boolean) shaderStorageImageMultisample}. */
    public static void nshaderStorageImageMultisample(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE, value); }
    /** Unsafe version of {@link #shaderStorageImageReadWithoutFormat(boolean) shaderStorageImageReadWithoutFormat}. */
    public static void nshaderStorageImageReadWithoutFormat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT, value); }
    /** Unsafe version of {@link #shaderStorageImageWriteWithoutFormat(boolean) shaderStorageImageWriteWithoutFormat}. */
    public static void nshaderStorageImageWriteWithoutFormat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT, value); }
    /** Unsafe version of {@link #shaderUniformBufferArrayDynamicIndexing(boolean) shaderUniformBufferArrayDynamicIndexing}. */
    public static void nshaderUniformBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderSampledImageArrayDynamicIndexing(boolean) shaderSampledImageArrayDynamicIndexing}. */
    public static void nshaderSampledImageArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageBufferArrayDynamicIndexing(boolean) shaderStorageBufferArrayDynamicIndexing}. */
    public static void nshaderStorageBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageImageArrayDynamicIndexing(boolean) shaderStorageImageArrayDynamicIndexing}. */
    public static void nshaderStorageImageArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderClipDistance(boolean) shaderClipDistance}. */
    public static void nshaderClipDistance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE, value); }
    /** Unsafe version of {@link #shaderCullDistance(boolean) shaderCullDistance}. */
    public static void nshaderCullDistance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERCULLDISTANCE, value); }
    /** Unsafe version of {@link #shaderFloat64(boolean) shaderFloat64}. */
    public static void nshaderFloat64(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERFLOAT64, value); }
    /** Unsafe version of {@link #shaderInt64(boolean) shaderInt64}. */
    public static void nshaderInt64(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERINT64, value); }
    /** Unsafe version of {@link #shaderInt16(boolean) shaderInt16}. */
    public static void nshaderInt16(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERINT16, value); }
    /** Unsafe version of {@link #shaderResourceResidency(boolean) shaderResourceResidency}. */
    public static void nshaderResourceResidency(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY, value); }
    /** Unsafe version of {@link #shaderResourceMinLod(boolean) shaderResourceMinLod}. */
    public static void nshaderResourceMinLod(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD, value); }
    /** Unsafe version of {@link #sparseBinding(boolean) sparseBinding}. */
    public static void nsparseBinding(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSEBINDING, value); }
    /** Unsafe version of {@link #sparseResidencyBuffer(boolean) sparseResidencyBuffer}. */
    public static void nsparseResidencyBuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER, value); }
    /** Unsafe version of {@link #sparseResidencyImage2D(boolean) sparseResidencyImage2D}. */
    public static void nsparseResidencyImage2D(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D, value); }
    /** Unsafe version of {@link #sparseResidencyImage3D(boolean) sparseResidencyImage3D}. */
    public static void nsparseResidencyImage3D(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D, value); }
    /** Unsafe version of {@link #sparseResidency2Samples(boolean) sparseResidency2Samples}. */
    public static void nsparseResidency2Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidency4Samples(boolean) sparseResidency4Samples}. */
    public static void nsparseResidency4Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidency8Samples(boolean) sparseResidency8Samples}. */
    public static void nsparseResidency8Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidency16Samples(boolean) sparseResidency16Samples}. */
    public static void nsparseResidency16Samples(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidencyAliased(boolean) sparseResidencyAliased}. */
    public static void nsparseResidencyAliased(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED, value); }
    /** Unsafe version of {@link #variableMultisampleRate(boolean) variableMultisampleRate}. */
    public static void nvariableMultisampleRate(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE, value); }
    /** Unsafe version of {@link #inheritedQueries(boolean) inheritedQueries}. */
    public static void ninheritedQueries(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures.INHERITEDQUERIES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFeatures ELEMENT_FACTORY = VkPhysicalDeviceFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFeatures#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code robustBufferAccess} field. */
        @NativeType("VkBool32")
        public boolean robustBufferAccess() { return VkPhysicalDeviceFeatures.nrobustBufferAccess(address()) != 0; }
        /** @return the value of the {@code fullDrawIndexUint32} field. */
        @NativeType("VkBool32")
        public boolean fullDrawIndexUint32() { return VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address()) != 0; }
        /** @return the value of the {@code imageCubeArray} field. */
        @NativeType("VkBool32")
        public boolean imageCubeArray() { return VkPhysicalDeviceFeatures.nimageCubeArray(address()) != 0; }
        /** @return the value of the {@code independentBlend} field. */
        @NativeType("VkBool32")
        public boolean independentBlend() { return VkPhysicalDeviceFeatures.nindependentBlend(address()) != 0; }
        /** @return the value of the {@code geometryShader} field. */
        @NativeType("VkBool32")
        public boolean geometryShader() { return VkPhysicalDeviceFeatures.ngeometryShader(address()) != 0; }
        /** @return the value of the {@code tessellationShader} field. */
        @NativeType("VkBool32")
        public boolean tessellationShader() { return VkPhysicalDeviceFeatures.ntessellationShader(address()) != 0; }
        /** @return the value of the {@code sampleRateShading} field. */
        @NativeType("VkBool32")
        public boolean sampleRateShading() { return VkPhysicalDeviceFeatures.nsampleRateShading(address()) != 0; }
        /** @return the value of the {@code dualSrcBlend} field. */
        @NativeType("VkBool32")
        public boolean dualSrcBlend() { return VkPhysicalDeviceFeatures.ndualSrcBlend(address()) != 0; }
        /** @return the value of the {@code logicOp} field. */
        @NativeType("VkBool32")
        public boolean logicOp() { return VkPhysicalDeviceFeatures.nlogicOp(address()) != 0; }
        /** @return the value of the {@code multiDrawIndirect} field. */
        @NativeType("VkBool32")
        public boolean multiDrawIndirect() { return VkPhysicalDeviceFeatures.nmultiDrawIndirect(address()) != 0; }
        /** @return the value of the {@code drawIndirectFirstInstance} field. */
        @NativeType("VkBool32")
        public boolean drawIndirectFirstInstance() { return VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address()) != 0; }
        /** @return the value of the {@code depthClamp} field. */
        @NativeType("VkBool32")
        public boolean depthClamp() { return VkPhysicalDeviceFeatures.ndepthClamp(address()) != 0; }
        /** @return the value of the {@code depthBiasClamp} field. */
        @NativeType("VkBool32")
        public boolean depthBiasClamp() { return VkPhysicalDeviceFeatures.ndepthBiasClamp(address()) != 0; }
        /** @return the value of the {@code fillModeNonSolid} field. */
        @NativeType("VkBool32")
        public boolean fillModeNonSolid() { return VkPhysicalDeviceFeatures.nfillModeNonSolid(address()) != 0; }
        /** @return the value of the {@code depthBounds} field. */
        @NativeType("VkBool32")
        public boolean depthBounds() { return VkPhysicalDeviceFeatures.ndepthBounds(address()) != 0; }
        /** @return the value of the {@code wideLines} field. */
        @NativeType("VkBool32")
        public boolean wideLines() { return VkPhysicalDeviceFeatures.nwideLines(address()) != 0; }
        /** @return the value of the {@code largePoints} field. */
        @NativeType("VkBool32")
        public boolean largePoints() { return VkPhysicalDeviceFeatures.nlargePoints(address()) != 0; }
        /** @return the value of the {@code alphaToOne} field. */
        @NativeType("VkBool32")
        public boolean alphaToOne() { return VkPhysicalDeviceFeatures.nalphaToOne(address()) != 0; }
        /** @return the value of the {@code multiViewport} field. */
        @NativeType("VkBool32")
        public boolean multiViewport() { return VkPhysicalDeviceFeatures.nmultiViewport(address()) != 0; }
        /** @return the value of the {@code samplerAnisotropy} field. */
        @NativeType("VkBool32")
        public boolean samplerAnisotropy() { return VkPhysicalDeviceFeatures.nsamplerAnisotropy(address()) != 0; }
        /** @return the value of the {@code textureCompressionETC2} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionETC2() { return VkPhysicalDeviceFeatures.ntextureCompressionETC2(address()) != 0; }
        /** @return the value of the {@code textureCompressionASTC_LDR} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionASTC_LDR() { return VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address()) != 0; }
        /** @return the value of the {@code textureCompressionBC} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionBC() { return VkPhysicalDeviceFeatures.ntextureCompressionBC(address()) != 0; }
        /** @return the value of the {@code occlusionQueryPrecise} field. */
        @NativeType("VkBool32")
        public boolean occlusionQueryPrecise() { return VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address()) != 0; }
        /** @return the value of the {@code pipelineStatisticsQuery} field. */
        @NativeType("VkBool32")
        public boolean pipelineStatisticsQuery() { return VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address()) != 0; }
        /** @return the value of the {@code vertexPipelineStoresAndAtomics} field. */
        @NativeType("VkBool32")
        public boolean vertexPipelineStoresAndAtomics() { return VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address()) != 0; }
        /** @return the value of the {@code fragmentStoresAndAtomics} field. */
        @NativeType("VkBool32")
        public boolean fragmentStoresAndAtomics() { return VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address()) != 0; }
        /** @return the value of the {@code shaderTessellationAndGeometryPointSize} field. */
        @NativeType("VkBool32")
        public boolean shaderTessellationAndGeometryPointSize() { return VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address()) != 0; }
        /** @return the value of the {@code shaderImageGatherExtended} field. */
        @NativeType("VkBool32")
        public boolean shaderImageGatherExtended() { return VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address()) != 0; }
        /** @return the value of the {@code shaderStorageImageExtendedFormats} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageExtendedFormats() { return VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address()) != 0; }
        /** @return the value of the {@code shaderStorageImageMultisample} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageMultisample() { return VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address()) != 0; }
        /** @return the value of the {@code shaderStorageImageReadWithoutFormat} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageReadWithoutFormat() { return VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address()) != 0; }
        /** @return the value of the {@code shaderStorageImageWriteWithoutFormat} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageWriteWithoutFormat() { return VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address()) != 0; }
        /** @return the value of the {@code shaderUniformBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@code shaderSampledImageArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@code shaderStorageBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@code shaderStorageImageArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@code shaderClipDistance} field. */
        @NativeType("VkBool32")
        public boolean shaderClipDistance() { return VkPhysicalDeviceFeatures.nshaderClipDistance(address()) != 0; }
        /** @return the value of the {@code shaderCullDistance} field. */
        @NativeType("VkBool32")
        public boolean shaderCullDistance() { return VkPhysicalDeviceFeatures.nshaderCullDistance(address()) != 0; }
        /** @return the value of the {@code shaderFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat64() { return VkPhysicalDeviceFeatures.nshaderFloat64(address()) != 0; }
        /** @return the value of the {@code shaderInt64} field. */
        @NativeType("VkBool32")
        public boolean shaderInt64() { return VkPhysicalDeviceFeatures.nshaderInt64(address()) != 0; }
        /** @return the value of the {@code shaderInt16} field. */
        @NativeType("VkBool32")
        public boolean shaderInt16() { return VkPhysicalDeviceFeatures.nshaderInt16(address()) != 0; }
        /** @return the value of the {@code shaderResourceResidency} field. */
        @NativeType("VkBool32")
        public boolean shaderResourceResidency() { return VkPhysicalDeviceFeatures.nshaderResourceResidency(address()) != 0; }
        /** @return the value of the {@code shaderResourceMinLod} field. */
        @NativeType("VkBool32")
        public boolean shaderResourceMinLod() { return VkPhysicalDeviceFeatures.nshaderResourceMinLod(address()) != 0; }
        /** @return the value of the {@code sparseBinding} field. */
        @NativeType("VkBool32")
        public boolean sparseBinding() { return VkPhysicalDeviceFeatures.nsparseBinding(address()) != 0; }
        /** @return the value of the {@code sparseResidencyBuffer} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyBuffer() { return VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address()) != 0; }
        /** @return the value of the {@code sparseResidencyImage2D} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyImage2D() { return VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address()) != 0; }
        /** @return the value of the {@code sparseResidencyImage3D} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyImage3D() { return VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address()) != 0; }
        /** @return the value of the {@code sparseResidency2Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency2Samples() { return VkPhysicalDeviceFeatures.nsparseResidency2Samples(address()) != 0; }
        /** @return the value of the {@code sparseResidency4Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency4Samples() { return VkPhysicalDeviceFeatures.nsparseResidency4Samples(address()) != 0; }
        /** @return the value of the {@code sparseResidency8Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency8Samples() { return VkPhysicalDeviceFeatures.nsparseResidency8Samples(address()) != 0; }
        /** @return the value of the {@code sparseResidency16Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency16Samples() { return VkPhysicalDeviceFeatures.nsparseResidency16Samples(address()) != 0; }
        /** @return the value of the {@code sparseResidencyAliased} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyAliased() { return VkPhysicalDeviceFeatures.nsparseResidencyAliased(address()) != 0; }
        /** @return the value of the {@code variableMultisampleRate} field. */
        @NativeType("VkBool32")
        public boolean variableMultisampleRate() { return VkPhysicalDeviceFeatures.nvariableMultisampleRate(address()) != 0; }
        /** @return the value of the {@code inheritedQueries} field. */
        @NativeType("VkBool32")
        public boolean inheritedQueries() { return VkPhysicalDeviceFeatures.ninheritedQueries(address()) != 0; }

        /** Sets the specified value to the {@code robustBufferAccess} field. */
        public VkPhysicalDeviceFeatures.Buffer robustBufferAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nrobustBufferAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fullDrawIndexUint32} field. */
        public VkPhysicalDeviceFeatures.Buffer fullDrawIndexUint32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code imageCubeArray} field. */
        public VkPhysicalDeviceFeatures.Buffer imageCubeArray(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nimageCubeArray(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code independentBlend} field. */
        public VkPhysicalDeviceFeatures.Buffer independentBlend(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nindependentBlend(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code geometryShader} field. */
        public VkPhysicalDeviceFeatures.Buffer geometryShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ngeometryShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tessellationShader} field. */
        public VkPhysicalDeviceFeatures.Buffer tessellationShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntessellationShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sampleRateShading} field. */
        public VkPhysicalDeviceFeatures.Buffer sampleRateShading(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsampleRateShading(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dualSrcBlend} field. */
        public VkPhysicalDeviceFeatures.Buffer dualSrcBlend(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndualSrcBlend(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code logicOp} field. */
        public VkPhysicalDeviceFeatures.Buffer logicOp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nlogicOp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiDrawIndirect} field. */
        public VkPhysicalDeviceFeatures.Buffer multiDrawIndirect(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nmultiDrawIndirect(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code drawIndirectFirstInstance} field. */
        public VkPhysicalDeviceFeatures.Buffer drawIndirectFirstInstance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code depthClamp} field. */
        public VkPhysicalDeviceFeatures.Buffer depthClamp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndepthClamp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code depthBiasClamp} field. */
        public VkPhysicalDeviceFeatures.Buffer depthBiasClamp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndepthBiasClamp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fillModeNonSolid} field. */
        public VkPhysicalDeviceFeatures.Buffer fillModeNonSolid(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nfillModeNonSolid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code depthBounds} field. */
        public VkPhysicalDeviceFeatures.Buffer depthBounds(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndepthBounds(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code wideLines} field. */
        public VkPhysicalDeviceFeatures.Buffer wideLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nwideLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code largePoints} field. */
        public VkPhysicalDeviceFeatures.Buffer largePoints(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nlargePoints(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code alphaToOne} field. */
        public VkPhysicalDeviceFeatures.Buffer alphaToOne(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nalphaToOne(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiViewport} field. */
        public VkPhysicalDeviceFeatures.Buffer multiViewport(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nmultiViewport(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code samplerAnisotropy} field. */
        public VkPhysicalDeviceFeatures.Buffer samplerAnisotropy(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsamplerAnisotropy(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code textureCompressionETC2} field. */
        public VkPhysicalDeviceFeatures.Buffer textureCompressionETC2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntextureCompressionETC2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code textureCompressionASTC_LDR} field. */
        public VkPhysicalDeviceFeatures.Buffer textureCompressionASTC_LDR(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code textureCompressionBC} field. */
        public VkPhysicalDeviceFeatures.Buffer textureCompressionBC(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntextureCompressionBC(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code occlusionQueryPrecise} field. */
        public VkPhysicalDeviceFeatures.Buffer occlusionQueryPrecise(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pipelineStatisticsQuery} field. */
        public VkPhysicalDeviceFeatures.Buffer pipelineStatisticsQuery(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vertexPipelineStoresAndAtomics} field. */
        public VkPhysicalDeviceFeatures.Buffer vertexPipelineStoresAndAtomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fragmentStoresAndAtomics} field. */
        public VkPhysicalDeviceFeatures.Buffer fragmentStoresAndAtomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderTessellationAndGeometryPointSize} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderTessellationAndGeometryPointSize(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderImageGatherExtended} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderImageGatherExtended(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageExtendedFormats} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageExtendedFormats(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageMultisample} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageMultisample(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageReadWithoutFormat} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageReadWithoutFormat(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageWriteWithoutFormat} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageWriteWithoutFormat(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderUniformBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSampledImageArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderSampledImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderClipDistance} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderClipDistance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderClipDistance(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderCullDistance} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderCullDistance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderCullDistance(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderFloat64} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderFloat64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderFloat64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInt64} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderInt64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderInt64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInt16} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderInt16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderInt16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderResourceResidency} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderResourceResidency(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderResourceResidency(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderResourceMinLod} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderResourceMinLod(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderResourceMinLod(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseBinding} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseBinding(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseBinding(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidencyBuffer} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidencyImage2D} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyImage2D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidencyImage3D} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyImage3D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidency2Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency2Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency2Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidency4Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency4Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency4Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidency8Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency8Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency8Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidency16Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency16Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency16Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseResidencyAliased} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyAliased(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyAliased(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code variableMultisampleRate} field. */
        public VkPhysicalDeviceFeatures.Buffer variableMultisampleRate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nvariableMultisampleRate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code inheritedQueries} field. */
        public VkPhysicalDeviceFeatures.Buffer inheritedQueries(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ninheritedQueries(address(), value ? 1 : 0); return this; }

    }

}