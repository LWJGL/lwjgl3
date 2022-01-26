/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure specifying physical device properties for functionality promoted to Vulkan 1.2.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVulkan12Properties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These properties correspond to Vulkan 1.2 functionality.</p>
 * 
 * <p>The members of {@link VkPhysicalDeviceVulkan12Properties} <b>must</b> have the same values as the corresponding members of {@link VkPhysicalDeviceDriverProperties}, {@link VkPhysicalDeviceFloatControlsProperties}, {@link VkPhysicalDeviceDescriptorIndexingProperties}, {@link VkPhysicalDeviceDepthStencilResolveProperties}, {@link VkPhysicalDeviceSamplerFilterMinmaxProperties}, and {@link VkPhysicalDeviceTimelineSemaphoreProperties}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkConformanceVersion}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkan12Properties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDriverId {@link #driverID};
 *     char {@link #driverName}[VK_MAX_DRIVER_NAME_SIZE];
 *     char {@link #driverInfo}[VK_MAX_DRIVER_INFO_SIZE];
 *     {@link VkConformanceVersion VkConformanceVersion} {@link #conformanceVersion};
 *     VkShaderFloatControlsIndependence {@link #denormBehaviorIndependence};
 *     VkShaderFloatControlsIndependence {@link #roundingModeIndependence};
 *     VkBool32 {@link #shaderSignedZeroInfNanPreserveFloat16};
 *     VkBool32 {@link #shaderSignedZeroInfNanPreserveFloat32};
 *     VkBool32 {@link #shaderSignedZeroInfNanPreserveFloat64};
 *     VkBool32 {@link #shaderDenormPreserveFloat16};
 *     VkBool32 {@link #shaderDenormPreserveFloat32};
 *     VkBool32 {@link #shaderDenormPreserveFloat64};
 *     VkBool32 {@link #shaderDenormFlushToZeroFloat16};
 *     VkBool32 {@link #shaderDenormFlushToZeroFloat32};
 *     VkBool32 {@link #shaderDenormFlushToZeroFloat64};
 *     VkBool32 {@link #shaderRoundingModeRTEFloat16};
 *     VkBool32 {@link #shaderRoundingModeRTEFloat32};
 *     VkBool32 {@link #shaderRoundingModeRTEFloat64};
 *     VkBool32 {@link #shaderRoundingModeRTZFloat16};
 *     VkBool32 {@link #shaderRoundingModeRTZFloat32};
 *     VkBool32 {@link #shaderRoundingModeRTZFloat64};
 *     uint32_t {@link #maxUpdateAfterBindDescriptorsInAllPools};
 *     VkBool32 {@link #shaderUniformBufferArrayNonUniformIndexingNative};
 *     VkBool32 {@link #shaderSampledImageArrayNonUniformIndexingNative};
 *     VkBool32 {@link #shaderStorageBufferArrayNonUniformIndexingNative};
 *     VkBool32 {@link #shaderStorageImageArrayNonUniformIndexingNative};
 *     VkBool32 {@link #shaderInputAttachmentArrayNonUniformIndexingNative};
 *     VkBool32 {@link #robustBufferAccessUpdateAfterBind};
 *     VkBool32 {@link #quadDivergentImplicitLod};
 *     uint32_t {@link #maxPerStageDescriptorUpdateAfterBindSamplers};
 *     uint32_t {@link #maxPerStageDescriptorUpdateAfterBindUniformBuffers};
 *     uint32_t {@link #maxPerStageDescriptorUpdateAfterBindStorageBuffers};
 *     uint32_t {@link #maxPerStageDescriptorUpdateAfterBindSampledImages};
 *     uint32_t {@link #maxPerStageDescriptorUpdateAfterBindStorageImages};
 *     uint32_t {@link #maxPerStageDescriptorUpdateAfterBindInputAttachments};
 *     uint32_t {@link #maxPerStageUpdateAfterBindResources};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindSamplers};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindUniformBuffers};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindUniformBuffersDynamic};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindStorageBuffers};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindStorageBuffersDynamic};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindSampledImages};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindStorageImages};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindInputAttachments};
 *     VkResolveModeFlags {@link #supportedDepthResolveModes};
 *     VkResolveModeFlags {@link #supportedStencilResolveModes};
 *     VkBool32 {@link #independentResolveNone};
 *     VkBool32 {@link #independentResolve};
 *     VkBool32 {@link #filterMinmaxSingleComponentFormats};
 *     VkBool32 {@link #filterMinmaxImageComponentMapping};
 *     uint64_t {@link #maxTimelineSemaphoreValueDifference};
 *     VkSampleCountFlags {@link #framebufferIntegerColorSampleCounts};
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkan12Properties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRIVERID,
        DRIVERNAME,
        DRIVERINFO,
        CONFORMANCEVERSION,
        DENORMBEHAVIORINDEPENDENCE,
        ROUNDINGMODEINDEPENDENCE,
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT16,
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT32,
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT64,
        SHADERDENORMPRESERVEFLOAT16,
        SHADERDENORMPRESERVEFLOAT32,
        SHADERDENORMPRESERVEFLOAT64,
        SHADERDENORMFLUSHTOZEROFLOAT16,
        SHADERDENORMFLUSHTOZEROFLOAT32,
        SHADERDENORMFLUSHTOZEROFLOAT64,
        SHADERROUNDINGMODERTEFLOAT16,
        SHADERROUNDINGMODERTEFLOAT32,
        SHADERROUNDINGMODERTEFLOAT64,
        SHADERROUNDINGMODERTZFLOAT16,
        SHADERROUNDINGMODERTZFLOAT32,
        SHADERROUNDINGMODERTZFLOAT64,
        MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS,
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE,
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE,
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE,
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE,
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE,
        ROBUSTBUFFERACCESSUPDATEAFTERBIND,
        QUADDIVERGENTIMPLICITLOD,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS,
        MAXPERSTAGEUPDATEAFTERBINDRESOURCES,
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS,
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS,
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC,
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS,
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC,
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES,
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES,
        MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS,
        SUPPORTEDDEPTHRESOLVEMODES,
        SUPPORTEDSTENCILRESOLVEMODES,
        INDEPENDENTRESOLVENONE,
        INDEPENDENTRESOLVE,
        FILTERMINMAXSINGLECOMPONENTFORMATS,
        FILTERMINMAXIMAGECOMPONENTMAPPING,
        MAXTIMELINESEMAPHOREVALUEDIFFERENCE,
        FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, VK_MAX_DRIVER_NAME_SIZE),
            __array(1, VK_MAX_DRIVER_INFO_SIZE),
            __member(VkConformanceVersion.SIZEOF, VkConformanceVersion.ALIGNOF),
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
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRIVERID = layout.offsetof(2);
        DRIVERNAME = layout.offsetof(3);
        DRIVERINFO = layout.offsetof(4);
        CONFORMANCEVERSION = layout.offsetof(5);
        DENORMBEHAVIORINDEPENDENCE = layout.offsetof(6);
        ROUNDINGMODEINDEPENDENCE = layout.offsetof(7);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT16 = layout.offsetof(8);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT32 = layout.offsetof(9);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT64 = layout.offsetof(10);
        SHADERDENORMPRESERVEFLOAT16 = layout.offsetof(11);
        SHADERDENORMPRESERVEFLOAT32 = layout.offsetof(12);
        SHADERDENORMPRESERVEFLOAT64 = layout.offsetof(13);
        SHADERDENORMFLUSHTOZEROFLOAT16 = layout.offsetof(14);
        SHADERDENORMFLUSHTOZEROFLOAT32 = layout.offsetof(15);
        SHADERDENORMFLUSHTOZEROFLOAT64 = layout.offsetof(16);
        SHADERROUNDINGMODERTEFLOAT16 = layout.offsetof(17);
        SHADERROUNDINGMODERTEFLOAT32 = layout.offsetof(18);
        SHADERROUNDINGMODERTEFLOAT64 = layout.offsetof(19);
        SHADERROUNDINGMODERTZFLOAT16 = layout.offsetof(20);
        SHADERROUNDINGMODERTZFLOAT32 = layout.offsetof(21);
        SHADERROUNDINGMODERTZFLOAT64 = layout.offsetof(22);
        MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS = layout.offsetof(23);
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(24);
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(25);
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(26);
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(27);
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(28);
        ROBUSTBUFFERACCESSUPDATEAFTERBIND = layout.offsetof(29);
        QUADDIVERGENTIMPLICITLOD = layout.offsetof(30);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS = layout.offsetof(31);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS = layout.offsetof(32);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS = layout.offsetof(33);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES = layout.offsetof(34);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES = layout.offsetof(35);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS = layout.offsetof(36);
        MAXPERSTAGEUPDATEAFTERBINDRESOURCES = layout.offsetof(37);
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS = layout.offsetof(38);
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS = layout.offsetof(39);
        MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC = layout.offsetof(40);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS = layout.offsetof(41);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC = layout.offsetof(42);
        MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES = layout.offsetof(43);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES = layout.offsetof(44);
        MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS = layout.offsetof(45);
        SUPPORTEDDEPTHRESOLVEMODES = layout.offsetof(46);
        SUPPORTEDSTENCILRESOLVEMODES = layout.offsetof(47);
        INDEPENDENTRESOLVENONE = layout.offsetof(48);
        INDEPENDENTRESOLVE = layout.offsetof(49);
        FILTERMINMAXSINGLECOMPONENTFORMATS = layout.offsetof(50);
        FILTERMINMAXIMAGECOMPONENTMAPPING = layout.offsetof(51);
        MAXTIMELINESEMAPHOREVALUEDIFFERENCE = layout.offsetof(52);
        FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS = layout.offsetof(53);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan12Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan12Properties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a unique identifier for the driver of the physical device. */
    @NativeType("VkDriverId")
    public int driverID() { return ndriverID(address()); }
    /** an array of {@link VK10#VK_MAX_DRIVER_NAME_SIZE MAX_DRIVER_NAME_SIZE} {@code char} containing a null-terminated UTF-8 string which is the name of the driver. */
    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public ByteBuffer driverName() { return ndriverName(address()); }
    /** an array of {@link VK10#VK_MAX_DRIVER_NAME_SIZE MAX_DRIVER_NAME_SIZE} {@code char} containing a null-terminated UTF-8 string which is the name of the driver. */
    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public String driverNameString() { return ndriverNameString(address()); }
    /** an array of {@link VK10#VK_MAX_DRIVER_INFO_SIZE MAX_DRIVER_INFO_SIZE} {@code char} containing a null-terminated UTF-8 string with additional information about the driver. */
    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public ByteBuffer driverInfo() { return ndriverInfo(address()); }
    /** an array of {@link VK10#VK_MAX_DRIVER_INFO_SIZE MAX_DRIVER_INFO_SIZE} {@code char} containing a null-terminated UTF-8 string with additional information about the driver. */
    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public String driverInfoString() { return ndriverInfoString(address()); }
    /** the version of the Vulkan conformance test this driver is conformant against (see {@link VkConformanceVersion}). */
    public VkConformanceVersion conformanceVersion() { return nconformanceVersion(address()); }
    /** a {@code VkShaderFloatControlsIndependence} value indicating whether, and how, denorm behavior can be set independently for different bit widths. */
    @NativeType("VkShaderFloatControlsIndependence")
    public int denormBehaviorIndependence() { return ndenormBehaviorIndependence(address()); }
    /** a {@code VkShaderFloatControlsIndependence} value indicating whether, and how, rounding modes can be set independently for different bit widths. */
    @NativeType("VkShaderFloatControlsIndependence")
    public int roundingModeIndependence() { return nroundingModeIndependence(address()); }
    /** a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 16-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat16() { return nshaderSignedZeroInfNanPreserveFloat16(address()) != 0; }
    /** a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 32-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat32() { return nshaderSignedZeroInfNanPreserveFloat32(address()) != 0; }
    /** a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 64-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat64() { return nshaderSignedZeroInfNanPreserveFloat64(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be preserved in 16-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat16() { return nshaderDenormPreserveFloat16(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be preserved in 32-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat32() { return nshaderDenormPreserveFloat32(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be preserved in 64-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat64() { return nshaderDenormPreserveFloat64(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be flushed to zero in 16-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat16() { return nshaderDenormFlushToZeroFloat16(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be flushed to zero in 32-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat32() { return nshaderDenormFlushToZeroFloat32(address()) != 0; }
    /** a boolean value indicating whether denormals <b>can</b> be flushed to zero in 64-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat64() { return nshaderDenormFlushToZeroFloat64(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 16-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat16() { return nshaderRoundingModeRTEFloat16(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 32-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat32() { return nshaderRoundingModeRTEFloat32(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 64-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat64() { return nshaderRoundingModeRTEFloat64(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 16-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 16-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat16() { return nshaderRoundingModeRTZFloat16(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 32-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 32-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat32() { return nshaderRoundingModeRTZFloat32(address()) != 0; }
    /** a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 64-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 64-bit floating-point types. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat64() { return nshaderRoundingModeRTZFloat64(address()) != 0; }
    /** the maximum number of descriptors (summed over all descriptor types) that <b>can</b> be created across all pools that are created with the {@link VK12#VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT} bit set. Pool creation <b>may</b> fail when this limit is exceeded, or when the space this limit represents is unable to satisfy a pool creation due to fragmentation. */
    @NativeType("uint32_t")
    public int maxUpdateAfterBindDescriptorsInAllPools() { return nmaxUpdateAfterBindDescriptorsInAllPools(address()); }
    /** a boolean value indicating whether uniform buffer descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of uniform buffers <b>may</b> execute multiple times in order to access all the descriptors. */
    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexingNative() { return nshaderUniformBufferArrayNonUniformIndexingNative(address()) != 0; }
    /** a boolean value indicating whether sampler and image descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of samplers or images <b>may</b> execute multiple times in order to access all the descriptors. */
    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexingNative() { return nshaderSampledImageArrayNonUniformIndexingNative(address()) != 0; }
    /** a boolean value indicating whether storage buffer descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of storage buffers <b>may</b> execute multiple times in order to access all the descriptors. */
    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexingNative() { return nshaderStorageBufferArrayNonUniformIndexingNative(address()) != 0; }
    /** a boolean value indicating whether storage image descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of storage images <b>may</b> execute multiple times in order to access all the descriptors. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexingNative() { return nshaderStorageImageArrayNonUniformIndexingNative(address()) != 0; }
    /** a boolean value indicating whether input attachment descriptors natively support nonuniform indexing. If this is {@link VK10#VK_FALSE FALSE}, then a single dynamic instance of an instruction that nonuniformly indexes an array of input attachments <b>may</b> execute multiple times in order to access all the descriptors. */
    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexingNative() { return nshaderInputAttachmentArrayNonUniformIndexingNative(address()) != 0; }
    /** a boolean value indicating whether <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> <b>can</b> be enabled in a device simultaneously with {@code descriptorBindingUniformBufferUpdateAfterBind}, {@code descriptorBindingStorageBufferUpdateAfterBind}, {@code descriptorBindingUniformTexelBufferUpdateAfterBind}, and/or {@code descriptorBindingStorageTexelBufferUpdateAfterBind}. If this is {@link VK10#VK_FALSE FALSE}, then either {@code robustBufferAccess} <b>must</b> be disabled or all of these update-after-bind features <b>must</b> be disabled. */
    @NativeType("VkBool32")
    public boolean robustBufferAccessUpdateAfterBind() { return nrobustBufferAccessUpdateAfterBind(address()) != 0; }
    /** a boolean value indicating whether implicit level of detail calculations for image operations have well-defined results when the image and/or sampler objects used for the instruction are not uniform within a quad. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-derivative-image-operations">Derivative Image Operations</a>. */
    @NativeType("VkBool32")
    public boolean quadDivergentImplicitLod() { return nquadDivergentImplicitLod(address()) != 0; }
    /** similar to {@code maxPerStageDescriptorSamplers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSamplers() { return nmaxPerStageDescriptorUpdateAfterBindSamplers(address()); }
    /** similar to {@code maxPerStageDescriptorUniformBuffers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(address()); }
    /** similar to {@code maxPerStageDescriptorStorageBuffers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(address()); }
    /** similar to {@code maxPerStageDescriptorSampledImages} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() { return nmaxPerStageDescriptorUpdateAfterBindSampledImages(address()); }
    /** similar to {@code maxPerStageDescriptorStorageImages} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() { return nmaxPerStageDescriptorUpdateAfterBindStorageImages(address()); }
    /** similar to {@code maxPerStageDescriptorInputAttachments} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return nmaxPerStageDescriptorUpdateAfterBindInputAttachments(address()); }
    /** similar to {@code maxPerStageResources} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageUpdateAfterBindResources() { return nmaxPerStageUpdateAfterBindResources(address()); }
    /** similar to {@code maxDescriptorSetSamplers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSamplers() { return nmaxDescriptorSetUpdateAfterBindSamplers(address()); }
    /** similar to {@code maxDescriptorSetUniformBuffers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() { return nmaxDescriptorSetUpdateAfterBindUniformBuffers(address()); }
    /** similar to {@code maxDescriptorSetUniformBuffersDynamic} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. While an application <b>can</b> allocate dynamic uniform buffer descriptors from a pool created with the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT}, bindings for these descriptors <b>must</b> not be present in any descriptor set layout that includes bindings created with {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(address()); }
    /** similar to {@code maxDescriptorSetStorageBuffers} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() { return nmaxDescriptorSetUpdateAfterBindStorageBuffers(address()); }
    /** similar to {@code maxDescriptorSetStorageBuffersDynamic} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. While an application <b>can</b> allocate dynamic storage buffer descriptors from a pool created with the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT}, bindings for these descriptors <b>must</b> not be present in any descriptor set layout that includes bindings created with {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(address()); }
    /** similar to {@code maxDescriptorSetSampledImages} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSampledImages() { return nmaxDescriptorSetUpdateAfterBindSampledImages(address()); }
    /** similar to {@code maxDescriptorSetStorageImages} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageImages() { return nmaxDescriptorSetUpdateAfterBindStorageImages(address()); }
    /** similar to {@code maxDescriptorSetInputAttachments} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInputAttachments() { return nmaxDescriptorSetUpdateAfterBindInputAttachments(address()); }
    /** a bitmask of {@code VkResolveModeFlagBits} indicating the set of supported depth resolve modes. {@link VK12#VK_RESOLVE_MODE_SAMPLE_ZERO_BIT RESOLVE_MODE_SAMPLE_ZERO_BIT} <b>must</b> be included in the set but implementations <b>may</b> support additional modes. */
    @NativeType("VkResolveModeFlags")
    public int supportedDepthResolveModes() { return nsupportedDepthResolveModes(address()); }
    /** a bitmask of {@code VkResolveModeFlagBits} indicating the set of supported stencil resolve modes. {@link VK12#VK_RESOLVE_MODE_SAMPLE_ZERO_BIT RESOLVE_MODE_SAMPLE_ZERO_BIT} <b>must</b> be included in the set but implementations <b>may</b> support additional modes. {@link VK12#VK_RESOLVE_MODE_AVERAGE_BIT RESOLVE_MODE_AVERAGE_BIT} <b>must</b> not be included in the set. */
    @NativeType("VkResolveModeFlags")
    public int supportedStencilResolveModes() { return nsupportedStencilResolveModes(address()); }
    /** {@link VK10#VK_TRUE TRUE} if the implementation supports setting the depth and stencil resolve modes to different values when one of those modes is {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}. Otherwise the implementation only supports setting both modes to the same value. */
    @NativeType("VkBool32")
    public boolean independentResolveNone() { return nindependentResolveNone(address()) != 0; }
    /** {@link VK10#VK_TRUE TRUE} if the implementation supports all combinations of the supported depth and stencil resolve modes, including setting either depth or stencil resolve mode to {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}. An implementation that supports {@code independentResolve} <b>must</b> also support {@code independentResolveNone}. */
    @NativeType("VkBool32")
    public boolean independentResolve() { return nindependentResolve(address()) != 0; }
    /** a boolean value indicating whether a minimum set of required formats support min/max filtering. */
    @NativeType("VkBool32")
    public boolean filterMinmaxSingleComponentFormats() { return nfilterMinmaxSingleComponentFormats(address()) != 0; }
    /** a boolean value indicating whether the implementation supports non-identity component mapping of the image when doing min/max filtering. */
    @NativeType("VkBool32")
    public boolean filterMinmaxImageComponentMapping() { return nfilterMinmaxImageComponentMapping(address()) != 0; }
    /** indicates the maximum difference allowed by the implementation between the current value of a timeline semaphore and any pending signal or wait operations. */
    @NativeType("uint64_t")
    public long maxTimelineSemaphoreValueDifference() { return nmaxTimelineSemaphoreValueDifference(address()); }
    /** a bitmask of {@code VkSampleCountFlagBits} indicating the color sample counts that are supported for all framebuffer color attachments with integer formats. */
    @NativeType("VkSampleCountFlags")
    public int framebufferIntegerColorSampleCounts() { return nframebufferIntegerColorSampleCounts(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan12Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan12Properties sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVulkan12Properties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan12Properties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan12Properties set(VkPhysicalDeviceVulkan12Properties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan12Properties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan12Properties malloc() {
        return wrap(VkPhysicalDeviceVulkan12Properties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan12Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan12Properties calloc() {
        return wrap(VkPhysicalDeviceVulkan12Properties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan12Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan12Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVulkan12Properties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan12Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan12Properties create(long address) {
        return wrap(VkPhysicalDeviceVulkan12Properties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan12Properties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVulkan12Properties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Properties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Properties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan12Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Properties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan12Properties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan12Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan12Properties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan12Properties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan12Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan12Properties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan12Properties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan12Properties.PNEXT); }
    /** Unsafe version of {@link #driverID}. */
    public static int ndriverID(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.DRIVERID); }
    /** Unsafe version of {@link #driverName}. */
    public static ByteBuffer ndriverName(long struct) { return memByteBuffer(struct + VkPhysicalDeviceVulkan12Properties.DRIVERNAME, VK_MAX_DRIVER_NAME_SIZE); }
    /** Unsafe version of {@link #driverNameString}. */
    public static String ndriverNameString(long struct) { return memUTF8(struct + VkPhysicalDeviceVulkan12Properties.DRIVERNAME); }
    /** Unsafe version of {@link #driverInfo}. */
    public static ByteBuffer ndriverInfo(long struct) { return memByteBuffer(struct + VkPhysicalDeviceVulkan12Properties.DRIVERINFO, VK_MAX_DRIVER_INFO_SIZE); }
    /** Unsafe version of {@link #driverInfoString}. */
    public static String ndriverInfoString(long struct) { return memUTF8(struct + VkPhysicalDeviceVulkan12Properties.DRIVERINFO); }
    /** Unsafe version of {@link #conformanceVersion}. */
    public static VkConformanceVersion nconformanceVersion(long struct) { return VkConformanceVersion.create(struct + VkPhysicalDeviceVulkan12Properties.CONFORMANCEVERSION); }
    /** Unsafe version of {@link #denormBehaviorIndependence}. */
    public static int ndenormBehaviorIndependence(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.DENORMBEHAVIORINDEPENDENCE); }
    /** Unsafe version of {@link #roundingModeIndependence}. */
    public static int nroundingModeIndependence(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.ROUNDINGMODEINDEPENDENCE); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat16}. */
    public static int nshaderSignedZeroInfNanPreserveFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat32}. */
    public static int nshaderSignedZeroInfNanPreserveFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat64}. */
    public static int nshaderSignedZeroInfNanPreserveFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat16}. */
    public static int nshaderDenormPreserveFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT16); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat32}. */
    public static int nshaderDenormPreserveFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT32); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat64}. */
    public static int nshaderDenormPreserveFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT64); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat16}. */
    public static int nshaderDenormFlushToZeroFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT16); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat32}. */
    public static int nshaderDenormFlushToZeroFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT32); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat64}. */
    public static int nshaderDenormFlushToZeroFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT64); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat16}. */
    public static int nshaderRoundingModeRTEFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT16); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat32}. */
    public static int nshaderRoundingModeRTEFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT32); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat64}. */
    public static int nshaderRoundingModeRTEFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT64); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat16}. */
    public static int nshaderRoundingModeRTZFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT16); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat32}. */
    public static int nshaderRoundingModeRTZFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT32); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat64}. */
    public static int nshaderRoundingModeRTZFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT64); }
    /** Unsafe version of {@link #maxUpdateAfterBindDescriptorsInAllPools}. */
    public static int nmaxUpdateAfterBindDescriptorsInAllPools(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexingNative}. */
    public static int nshaderUniformBufferArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexingNative}. */
    public static int nshaderSampledImageArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexingNative}. */
    public static int nshaderStorageBufferArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexingNative}. */
    public static int nshaderStorageImageArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexingNative}. */
    public static int nshaderInputAttachmentArrayNonUniformIndexingNative(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #robustBufferAccessUpdateAfterBind}. */
    public static int nrobustBufferAccessUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.ROBUSTBUFFERACCESSUPDATEAFTERBIND); }
    /** Unsafe version of {@link #quadDivergentImplicitLod}. */
    public static int nquadDivergentImplicitLod(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.QUADDIVERGENTIMPLICITLOD); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindSamplers}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindUniformBuffers}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindStorageBuffers}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindSampledImages}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindSampledImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindStorageImages}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindStorageImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindInputAttachments}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindInputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxPerStageUpdateAfterBindResources}. */
    public static int nmaxPerStageUpdateAfterBindResources(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEUPDATEAFTERBINDRESOURCES); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindSamplers}. */
    public static int nmaxDescriptorSetUpdateAfterBindSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindUniformBuffers}. */
    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindUniformBuffersDynamic}. */
    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindStorageBuffers}. */
    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindStorageBuffersDynamic}. */
    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindSampledImages}. */
    public static int nmaxDescriptorSetUpdateAfterBindSampledImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindStorageImages}. */
    public static int nmaxDescriptorSetUpdateAfterBindStorageImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindInputAttachments}. */
    public static int nmaxDescriptorSetUpdateAfterBindInputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS); }
    /** Unsafe version of {@link #supportedDepthResolveModes}. */
    public static int nsupportedDepthResolveModes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SUPPORTEDDEPTHRESOLVEMODES); }
    /** Unsafe version of {@link #supportedStencilResolveModes}. */
    public static int nsupportedStencilResolveModes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.SUPPORTEDSTENCILRESOLVEMODES); }
    /** Unsafe version of {@link #independentResolveNone}. */
    public static int nindependentResolveNone(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.INDEPENDENTRESOLVENONE); }
    /** Unsafe version of {@link #independentResolve}. */
    public static int nindependentResolve(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.INDEPENDENTRESOLVE); }
    /** Unsafe version of {@link #filterMinmaxSingleComponentFormats}. */
    public static int nfilterMinmaxSingleComponentFormats(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.FILTERMINMAXSINGLECOMPONENTFORMATS); }
    /** Unsafe version of {@link #filterMinmaxImageComponentMapping}. */
    public static int nfilterMinmaxImageComponentMapping(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.FILTERMINMAXIMAGECOMPONENTMAPPING); }
    /** Unsafe version of {@link #maxTimelineSemaphoreValueDifference}. */
    public static long nmaxTimelineSemaphoreValueDifference(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceVulkan12Properties.MAXTIMELINESEMAPHOREVALUEDIFFERENCE); }
    /** Unsafe version of {@link #framebufferIntegerColorSampleCounts}. */
    public static int nframebufferIntegerColorSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Properties.FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan12Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan12Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan12Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan12Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan12Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan12Properties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan12Properties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVulkan12Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan12Properties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan12Properties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#driverID} field. */
        @NativeType("VkDriverId")
        public int driverID() { return VkPhysicalDeviceVulkan12Properties.ndriverID(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceVulkan12Properties#driverName} field. */
        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public ByteBuffer driverName() { return VkPhysicalDeviceVulkan12Properties.ndriverName(address()); }
        /** @return the null-terminated string stored in the {@link VkPhysicalDeviceVulkan12Properties#driverName} field. */
        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public String driverNameString() { return VkPhysicalDeviceVulkan12Properties.ndriverNameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceVulkan12Properties#driverInfo} field. */
        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public ByteBuffer driverInfo() { return VkPhysicalDeviceVulkan12Properties.ndriverInfo(address()); }
        /** @return the null-terminated string stored in the {@link VkPhysicalDeviceVulkan12Properties#driverInfo} field. */
        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public String driverInfoString() { return VkPhysicalDeviceVulkan12Properties.ndriverInfoString(address()); }
        /** @return a {@link VkConformanceVersion} view of the {@link VkPhysicalDeviceVulkan12Properties#conformanceVersion} field. */
        public VkConformanceVersion conformanceVersion() { return VkPhysicalDeviceVulkan12Properties.nconformanceVersion(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#denormBehaviorIndependence} field. */
        @NativeType("VkShaderFloatControlsIndependence")
        public int denormBehaviorIndependence() { return VkPhysicalDeviceVulkan12Properties.ndenormBehaviorIndependence(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#roundingModeIndependence} field. */
        @NativeType("VkShaderFloatControlsIndependence")
        public int roundingModeIndependence() { return VkPhysicalDeviceVulkan12Properties.nroundingModeIndependence(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderSignedZeroInfNanPreserveFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat16() { return VkPhysicalDeviceVulkan12Properties.nshaderSignedZeroInfNanPreserveFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderSignedZeroInfNanPreserveFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat32() { return VkPhysicalDeviceVulkan12Properties.nshaderSignedZeroInfNanPreserveFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderSignedZeroInfNanPreserveFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat64() { return VkPhysicalDeviceVulkan12Properties.nshaderSignedZeroInfNanPreserveFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderDenormPreserveFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat16() { return VkPhysicalDeviceVulkan12Properties.nshaderDenormPreserveFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderDenormPreserveFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat32() { return VkPhysicalDeviceVulkan12Properties.nshaderDenormPreserveFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderDenormPreserveFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat64() { return VkPhysicalDeviceVulkan12Properties.nshaderDenormPreserveFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderDenormFlushToZeroFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat16() { return VkPhysicalDeviceVulkan12Properties.nshaderDenormFlushToZeroFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderDenormFlushToZeroFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat32() { return VkPhysicalDeviceVulkan12Properties.nshaderDenormFlushToZeroFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderDenormFlushToZeroFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat64() { return VkPhysicalDeviceVulkan12Properties.nshaderDenormFlushToZeroFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderRoundingModeRTEFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat16() { return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTEFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderRoundingModeRTEFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat32() { return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTEFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderRoundingModeRTEFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat64() { return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTEFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderRoundingModeRTZFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat16() { return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTZFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderRoundingModeRTZFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat32() { return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTZFloat32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderRoundingModeRTZFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat64() { return VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTZFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxUpdateAfterBindDescriptorsInAllPools} field. */
        @NativeType("uint32_t")
        public int maxUpdateAfterBindDescriptorsInAllPools() { return VkPhysicalDeviceVulkan12Properties.nmaxUpdateAfterBindDescriptorsInAllPools(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderUniformBufferArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.nshaderUniformBufferArrayNonUniformIndexingNative(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderSampledImageArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.nshaderSampledImageArrayNonUniformIndexingNative(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderStorageBufferArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.nshaderStorageBufferArrayNonUniformIndexingNative(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderStorageImageArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.nshaderStorageImageArrayNonUniformIndexingNative(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#shaderInputAttachmentArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.nshaderInputAttachmentArrayNonUniformIndexingNative(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#robustBufferAccessUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean robustBufferAccessUpdateAfterBind() { return VkPhysicalDeviceVulkan12Properties.nrobustBufferAccessUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#quadDivergentImplicitLod} field. */
        @NativeType("VkBool32")
        public boolean quadDivergentImplicitLod() { return VkPhysicalDeviceVulkan12Properties.nquadDivergentImplicitLod(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxPerStageDescriptorUpdateAfterBindSamplers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSamplers() { return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindSamplers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxPerStageDescriptorUpdateAfterBindUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxPerStageDescriptorUpdateAfterBindStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxPerStageDescriptorUpdateAfterBindSampledImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSampledImages() { return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindSampledImages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxPerStageDescriptorUpdateAfterBindStorageImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageImages() { return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindStorageImages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxPerStageDescriptorUpdateAfterBindInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindInputAttachments(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxPerStageUpdateAfterBindResources} field. */
        @NativeType("uint32_t")
        public int maxPerStageUpdateAfterBindResources() { return VkPhysicalDeviceVulkan12Properties.nmaxPerStageUpdateAfterBindResources(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxDescriptorSetUpdateAfterBindSamplers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSamplers() { return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindSamplers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxDescriptorSetUpdateAfterBindUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffers() { return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindUniformBuffers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxDescriptorSetUpdateAfterBindUniformBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxDescriptorSetUpdateAfterBindStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffers() { return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindStorageBuffers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxDescriptorSetUpdateAfterBindStorageBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxDescriptorSetUpdateAfterBindSampledImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSampledImages() { return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindSampledImages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxDescriptorSetUpdateAfterBindStorageImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageImages() { return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindStorageImages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxDescriptorSetUpdateAfterBindInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInputAttachments() { return VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindInputAttachments(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#supportedDepthResolveModes} field. */
        @NativeType("VkResolveModeFlags")
        public int supportedDepthResolveModes() { return VkPhysicalDeviceVulkan12Properties.nsupportedDepthResolveModes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#supportedStencilResolveModes} field. */
        @NativeType("VkResolveModeFlags")
        public int supportedStencilResolveModes() { return VkPhysicalDeviceVulkan12Properties.nsupportedStencilResolveModes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#independentResolveNone} field. */
        @NativeType("VkBool32")
        public boolean independentResolveNone() { return VkPhysicalDeviceVulkan12Properties.nindependentResolveNone(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#independentResolve} field. */
        @NativeType("VkBool32")
        public boolean independentResolve() { return VkPhysicalDeviceVulkan12Properties.nindependentResolve(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#filterMinmaxSingleComponentFormats} field. */
        @NativeType("VkBool32")
        public boolean filterMinmaxSingleComponentFormats() { return VkPhysicalDeviceVulkan12Properties.nfilterMinmaxSingleComponentFormats(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#filterMinmaxImageComponentMapping} field. */
        @NativeType("VkBool32")
        public boolean filterMinmaxImageComponentMapping() { return VkPhysicalDeviceVulkan12Properties.nfilterMinmaxImageComponentMapping(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#maxTimelineSemaphoreValueDifference} field. */
        @NativeType("uint64_t")
        public long maxTimelineSemaphoreValueDifference() { return VkPhysicalDeviceVulkan12Properties.nmaxTimelineSemaphoreValueDifference(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Properties#framebufferIntegerColorSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferIntegerColorSampleCounts() { return VkPhysicalDeviceVulkan12Properties.nframebufferIntegerColorSampleCounts(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Properties#sType} field. */
        public VkPhysicalDeviceVulkan12Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan12Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES} value to the {@link VkPhysicalDeviceVulkan12Properties#sType} field. */
        public VkPhysicalDeviceVulkan12Properties.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Properties#pNext} field. */
        public VkPhysicalDeviceVulkan12Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan12Properties.npNext(address(), value); return this; }

    }

}