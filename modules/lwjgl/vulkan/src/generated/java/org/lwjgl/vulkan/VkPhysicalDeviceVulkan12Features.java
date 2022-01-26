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

/**
 * Structure describing the Vulkan 1.2 features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVulkan12Features} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceVulkan12Features} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkan12Features {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #samplerMirrorClampToEdge};
 *     VkBool32 {@link #drawIndirectCount};
 *     VkBool32 {@link #storageBuffer8BitAccess};
 *     VkBool32 {@link #uniformAndStorageBuffer8BitAccess};
 *     VkBool32 {@link #storagePushConstant8};
 *     VkBool32 {@link #shaderBufferInt64Atomics};
 *     VkBool32 {@link #shaderSharedInt64Atomics};
 *     VkBool32 {@link #shaderFloat16};
 *     VkBool32 {@link #shaderInt8};
 *     VkBool32 {@link #descriptorIndexing};
 *     VkBool32 {@link #shaderInputAttachmentArrayDynamicIndexing};
 *     VkBool32 {@link #shaderUniformTexelBufferArrayDynamicIndexing};
 *     VkBool32 {@link #shaderStorageTexelBufferArrayDynamicIndexing};
 *     VkBool32 {@link #shaderUniformBufferArrayNonUniformIndexing};
 *     VkBool32 {@link #shaderSampledImageArrayNonUniformIndexing};
 *     VkBool32 {@link #shaderStorageBufferArrayNonUniformIndexing};
 *     VkBool32 {@link #shaderStorageImageArrayNonUniformIndexing};
 *     VkBool32 {@link #shaderInputAttachmentArrayNonUniformIndexing};
 *     VkBool32 {@link #shaderUniformTexelBufferArrayNonUniformIndexing};
 *     VkBool32 {@link #shaderStorageTexelBufferArrayNonUniformIndexing};
 *     VkBool32 {@link #descriptorBindingUniformBufferUpdateAfterBind};
 *     VkBool32 {@link #descriptorBindingSampledImageUpdateAfterBind};
 *     VkBool32 {@link #descriptorBindingStorageImageUpdateAfterBind};
 *     VkBool32 {@link #descriptorBindingStorageBufferUpdateAfterBind};
 *     VkBool32 {@link #descriptorBindingUniformTexelBufferUpdateAfterBind};
 *     VkBool32 {@link #descriptorBindingStorageTexelBufferUpdateAfterBind};
 *     VkBool32 {@link #descriptorBindingUpdateUnusedWhilePending};
 *     VkBool32 {@link #descriptorBindingPartiallyBound};
 *     VkBool32 {@link #descriptorBindingVariableDescriptorCount};
 *     VkBool32 {@link #runtimeDescriptorArray};
 *     VkBool32 {@link #samplerFilterMinmax};
 *     VkBool32 {@link #scalarBlockLayout};
 *     VkBool32 {@link #imagelessFramebuffer};
 *     VkBool32 {@link #uniformBufferStandardLayout};
 *     VkBool32 {@link #shaderSubgroupExtendedTypes};
 *     VkBool32 {@link #separateDepthStencilLayouts};
 *     VkBool32 {@link #hostQueryReset};
 *     VkBool32 {@link #timelineSemaphore};
 *     VkBool32 {@link #bufferDeviceAddress};
 *     VkBool32 {@link #bufferDeviceAddressCaptureReplay};
 *     VkBool32 {@link #bufferDeviceAddressMultiDevice};
 *     VkBool32 {@link #vulkanMemoryModel};
 *     VkBool32 {@link #vulkanMemoryModelDeviceScope};
 *     VkBool32 {@link #vulkanMemoryModelAvailabilityVisibilityChains};
 *     VkBool32 {@link #shaderOutputViewportIndex};
 *     VkBool32 {@link #shaderOutputLayer};
 *     VkBool32 {@link #subgroupBroadcastDynamicId};
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkan12Features extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLERMIRRORCLAMPTOEDGE,
        DRAWINDIRECTCOUNT,
        STORAGEBUFFER8BITACCESS,
        UNIFORMANDSTORAGEBUFFER8BITACCESS,
        STORAGEPUSHCONSTANT8,
        SHADERBUFFERINT64ATOMICS,
        SHADERSHAREDINT64ATOMICS,
        SHADERFLOAT16,
        SHADERINT8,
        DESCRIPTORINDEXING,
        SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING,
        SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING,
        SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING,
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING,
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING,
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING,
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING,
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING,
        SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING,
        SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING,
        DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND,
        DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND,
        DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND,
        DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND,
        DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND,
        DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND,
        DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING,
        DESCRIPTORBINDINGPARTIALLYBOUND,
        DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT,
        RUNTIMEDESCRIPTORARRAY,
        SAMPLERFILTERMINMAX,
        SCALARBLOCKLAYOUT,
        IMAGELESSFRAMEBUFFER,
        UNIFORMBUFFERSTANDARDLAYOUT,
        SHADERSUBGROUPEXTENDEDTYPES,
        SEPARATEDEPTHSTENCILLAYOUTS,
        HOSTQUERYRESET,
        TIMELINESEMAPHORE,
        BUFFERDEVICEADDRESS,
        BUFFERDEVICEADDRESSCAPTUREREPLAY,
        BUFFERDEVICEADDRESSMULTIDEVICE,
        VULKANMEMORYMODEL,
        VULKANMEMORYMODELDEVICESCOPE,
        VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS,
        SHADEROUTPUTVIEWPORTINDEX,
        SHADEROUTPUTLAYER,
        SUBGROUPBROADCASTDYNAMICID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLERMIRRORCLAMPTOEDGE = layout.offsetof(2);
        DRAWINDIRECTCOUNT = layout.offsetof(3);
        STORAGEBUFFER8BITACCESS = layout.offsetof(4);
        UNIFORMANDSTORAGEBUFFER8BITACCESS = layout.offsetof(5);
        STORAGEPUSHCONSTANT8 = layout.offsetof(6);
        SHADERBUFFERINT64ATOMICS = layout.offsetof(7);
        SHADERSHAREDINT64ATOMICS = layout.offsetof(8);
        SHADERFLOAT16 = layout.offsetof(9);
        SHADERINT8 = layout.offsetof(10);
        DESCRIPTORINDEXING = layout.offsetof(11);
        SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING = layout.offsetof(12);
        SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(13);
        SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(14);
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(15);
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(16);
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(17);
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(18);
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING = layout.offsetof(19);
        SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(20);
        SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(21);
        DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND = layout.offsetof(22);
        DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND = layout.offsetof(23);
        DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND = layout.offsetof(24);
        DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND = layout.offsetof(25);
        DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND = layout.offsetof(26);
        DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND = layout.offsetof(27);
        DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING = layout.offsetof(28);
        DESCRIPTORBINDINGPARTIALLYBOUND = layout.offsetof(29);
        DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT = layout.offsetof(30);
        RUNTIMEDESCRIPTORARRAY = layout.offsetof(31);
        SAMPLERFILTERMINMAX = layout.offsetof(32);
        SCALARBLOCKLAYOUT = layout.offsetof(33);
        IMAGELESSFRAMEBUFFER = layout.offsetof(34);
        UNIFORMBUFFERSTANDARDLAYOUT = layout.offsetof(35);
        SHADERSUBGROUPEXTENDEDTYPES = layout.offsetof(36);
        SEPARATEDEPTHSTENCILLAYOUTS = layout.offsetof(37);
        HOSTQUERYRESET = layout.offsetof(38);
        TIMELINESEMAPHORE = layout.offsetof(39);
        BUFFERDEVICEADDRESS = layout.offsetof(40);
        BUFFERDEVICEADDRESSCAPTUREREPLAY = layout.offsetof(41);
        BUFFERDEVICEADDRESSMULTIDEVICE = layout.offsetof(42);
        VULKANMEMORYMODEL = layout.offsetof(43);
        VULKANMEMORYMODELDEVICESCOPE = layout.offsetof(44);
        VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS = layout.offsetof(45);
        SHADEROUTPUTVIEWPORTINDEX = layout.offsetof(46);
        SHADEROUTPUTLAYER = layout.offsetof(47);
        SUBGROUPBROADCASTDYNAMICID = layout.offsetof(48);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan12Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan12Features(ByteBuffer container) {
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
    /** indicates whether the implementation supports the {@link VK12#VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE} sampler address mode. If this feature is not enabled, the {@link VK12#VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE} sampler address mode <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean samplerMirrorClampToEdge() { return nsamplerMirrorClampToEdge(address()) != 0; }
    /** indicates whether the implementation supports the {@link VK12#vkCmdDrawIndirectCount CmdDrawIndirectCount} and {@link VK12#vkCmdDrawIndexedIndirectCount CmdDrawIndexedIndirectCount} functions. If this feature is not enabled, these functions <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean drawIndirectCount() { return ndrawIndirectCount(address()) != 0; }
    /** indicates whether objects in the {@code StorageBuffer}, {@code ShaderRecordBufferKHR}, or {@code PhysicalStorageBuffer} storage class with the {@code Block} decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StorageBuffer8BitAccess} capability. */
    @NativeType("VkBool32")
    public boolean storageBuffer8BitAccess() { return nstorageBuffer8BitAccess(address()) != 0; }
    /** indicates whether objects in the {@code Uniform} storage class with the {@code Block} decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code UniformAndStorageBuffer8BitAccess} capability. */
    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer8BitAccess() { return nuniformAndStorageBuffer8BitAccess(address()) != 0; }
    /** indicates whether objects in the {@code PushConstant} storage class <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StoragePushConstant8} capability. */
    @NativeType("VkBool32")
    public boolean storagePushConstant8() { return nstoragePushConstant8(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 64-bit unsigned and signed integer atomic operations on buffers. */
    @NativeType("VkBool32")
    public boolean shaderBufferInt64Atomics() { return nshaderBufferInt64Atomics(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 64-bit unsigned and signed integer atomic operations on shared memory. */
    @NativeType("VkBool32")
    public boolean shaderSharedInt64Atomics() { return nshaderSharedInt64Atomics(address()) != 0; }
    /** indicates whether 16-bit floats (halfs) are supported in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Float16} capability. However, this only enables a subset of the storage classes that SPIR-V allows for the {@code Float16} SPIR-V capability: Declaring and using 16-bit floats in the {@code Private}, {@code Workgroup} (for non-Block variables), and {@code Function} storage classes is enabled, while declaring them in the interface storage classes (e.g., {@code UniformConstant}, {@code Uniform}, {@code StorageBuffer}, {@code Input}, {@code Output}, and {@code PushConstant}) is not enabled. */
    @NativeType("VkBool32")
    public boolean shaderFloat16() { return nshaderFloat16(address()) != 0; }
    /** indicates whether 8-bit integers (signed and unsigned) are supported in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Int8} capability. However, this only enables a subset of the storage classes that SPIR-V allows for the {@code Int8} SPIR-V capability: Declaring and using 8-bit integers in the {@code Private}, {@code Workgroup} (for non-Block variables), and {@code Function} storage classes is enabled, while declaring them in the interface storage classes (e.g., {@code UniformConstant}, {@code Uniform}, {@code StorageBuffer}, {@code Input}, {@code Output}, and {@code PushConstant}) is not enabled. */
    @NativeType("VkBool32")
    public boolean shaderInt8() { return nshaderInt8(address()) != 0; }
    /** indicates whether the implementation supports the minimum set of descriptor indexing features as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-requirements">Feature Requirements</a> section. Enabling the {@code descriptorIndexing} member when {@link VK10#vkCreateDevice CreateDevice} is called does not imply the other minimum descriptor indexing features are also enabled. Those other descriptor indexing features <b>must</b> be enabled individually as needed by the application. */
    @NativeType("VkBool32")
    public boolean descriptorIndexing() { return ndescriptorIndexing(address()) != 0; }
    /** indicates whether arrays of input attachments <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code InputAttachmentArrayDynamicIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayDynamicIndexing() { return nshaderInputAttachmentArrayDynamicIndexing(address()) != 0; }
    /** indicates whether arrays of uniform texel buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformTexelBufferArrayDynamicIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayDynamicIndexing() { return nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0; }
    /** indicates whether arrays of storage texel buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageTexelBufferArrayDynamicIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayDynamicIndexing() { return nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0; }
    /** indicates whether arrays of uniform buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformBufferArrayNonUniformIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexing() { return nshaderUniformBufferArrayNonUniformIndexing(address()) != 0; }
    /** indicates whether arrays of samplers or sampled images <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, or {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code SampledImageArrayNonUniformIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexing() { return nshaderSampledImageArrayNonUniformIndexing(address()) != 0; }
    /** indicates whether arrays of storage buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageBufferArrayNonUniformIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexing() { return nshaderStorageBufferArrayNonUniformIndexing(address()) != 0; }
    /** indicates whether arrays of storage images <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageArrayNonUniformIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexing() { return nshaderStorageImageArrayNonUniformIndexing(address()) != 0; }
    /** indicates whether arrays of input attachments <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code InputAttachmentArrayNonUniformIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexing() { return nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0; }
    /** indicates whether arrays of uniform texel buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformTexelBufferArrayNonUniformIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayNonUniformIndexing() { return nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0; }
    /** indicates whether arrays of storage texel buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageTexelBufferArrayNonUniformIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayNonUniformIndexing() { return nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0; }
    /** indicates whether the implementation supports updating uniform buffer descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}. */
    @NativeType("VkBool32")
    public boolean descriptorBindingUniformBufferUpdateAfterBind() { return ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0; }
    /** indicates whether the implementation supports updating sampled image descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, or {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}. */
    @NativeType("VkBool32")
    public boolean descriptorBindingSampledImageUpdateAfterBind() { return ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0; }
    /** indicates whether the implementation supports updating storage image descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageImageUpdateAfterBind() { return ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0; }
    /** indicates whether the implementation supports updating storage buffer descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageBufferUpdateAfterBind() { return ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0; }
    /** indicates whether the implementation supports updating uniform texel buffer descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}. */
    @NativeType("VkBool32")
    public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() { return ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0; }
    /** indicates whether the implementation supports updating storage texel buffer descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() { return ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0; }
    /** indicates whether the implementation supports updating descriptors while the set is in use. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT} <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean descriptorBindingUpdateUnusedWhilePending() { return ndescriptorBindingUpdateUnusedWhilePending(address()) != 0; }
    /** indicates whether the implementation supports statically using a descriptor set binding in which some descriptors are not valid. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT} <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean descriptorBindingPartiallyBound() { return ndescriptorBindingPartiallyBound(address()) != 0; }
    /** indicates whether the implementation supports descriptor sets with a variable-sized last binding. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT} <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean descriptorBindingVariableDescriptorCount() { return ndescriptorBindingVariableDescriptorCount(address()) != 0; }
    /** indicates whether the implementation supports the SPIR-V {@code RuntimeDescriptorArray} capability. If this feature is not enabled, descriptors <b>must</b> not be declared in runtime arrays. */
    @NativeType("VkBool32")
    public boolean runtimeDescriptorArray() { return nruntimeDescriptorArray(address()) != 0; }
    /** indicates whether the implementation supports a minimum set of required formats supporting min/max filtering as defined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-filterMinmaxSingleComponentFormats-minimum-requirements">{@code filterMinmaxSingleComponentFormats}</a> property minimum requirements. If this feature is not enabled, then no {@link VkSamplerCreateInfo} {@code pNext} chain can include a {@link VkSamplerReductionModeCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean samplerFilterMinmax() { return nsamplerFilterMinmax(address()) != 0; }
    /** indicates that the implementation supports the layout of resource blocks in shaders using <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-alignment-requirements">scalar alignment</a>. */
    @NativeType("VkBool32")
    public boolean scalarBlockLayout() { return nscalarBlockLayout(address()) != 0; }
    /** indicates that the implementation supports specifying the image view for attachments at render pass begin time via {@link VkRenderPassAttachmentBeginInfo}. */
    @NativeType("VkBool32")
    public boolean imagelessFramebuffer() { return nimagelessFramebuffer(address()) != 0; }
    /** indicates that the implementation supports the same layouts for uniform buffers as for storage and other kinds of buffers. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-resources-standard-layout">Standard Buffer Layout</a>. */
    @NativeType("VkBool32")
    public boolean uniformBufferStandardLayout() { return nuniformBufferStandardLayout(address()) != 0; }
    /** a boolean specifying whether subgroup operations can use 8-bit integer, 16-bit integer, 64-bit integer, 16-bit floating-point, and vectors of these types in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-group-operations">group operations</a> with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-scope-subgroup">subgroup scope</a>, if the implementation supports the types. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupExtendedTypes() { return nshaderSubgroupExtendedTypes(address()) != 0; }
    /** indicates whether the implementation supports a {@link VkImageMemoryBarrier} for a depth/stencil image with only one of {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} set, and whether {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL} can be used. */
    @NativeType("VkBool32")
    public boolean separateDepthStencilLayouts() { return nseparateDepthStencilLayouts(address()) != 0; }
    /** indicates that the implementation supports resetting queries from the host with {@link VK12#vkResetQueryPool ResetQueryPool}. */
    @NativeType("VkBool32")
    public boolean hostQueryReset() { return nhostQueryReset(address()) != 0; }
    /** indicates whether semaphores created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} are supported. */
    @NativeType("VkBool32")
    public boolean timelineSemaphore() { return ntimelineSemaphore(address()) != 0; }
    /** indicates that the implementation supports accessing buffer memory in shaders as storage buffers via an address queried from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddress() { return nbufferDeviceAddress(address()) != 0; }
    /** indicates that the implementation supports saving and reusing buffer and device addresses, e.g. for trace capture and replay. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddressCaptureReplay() { return nbufferDeviceAddressCaptureReplay(address()) != 0; }
    /** indicates that the implementation supports the {@code bufferDeviceAddress} , {@code rayTracingPipeline} and {@code rayQuery} features for logical devices created with multiple physical devices. If this feature is not supported, buffer and acceleration structure addresses <b>must</b> not be queried on a logical device created with more than one physical device. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddressMultiDevice() { return nbufferDeviceAddressMultiDevice(address()) != 0; }
    /** indicates whether the Vulkan Memory Model is supported, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-model">Vulkan Memory Model</a>. This also indicates whether shader modules <b>can</b> declare the {@code VulkanMemoryModel} capability. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModel() { return nvulkanMemoryModel(address()) != 0; }
    /** indicates whether the Vulkan Memory Model can use {@code Device} scope synchronization. This also indicates whether shader modules <b>can</b> declare the {@code VulkanMemoryModelDeviceScope} capability. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModelDeviceScope() { return nvulkanMemoryModelDeviceScope(address()) != 0; }
    /** indicates whether the Vulkan Memory Model can use <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-model-availability-visibility">availability and visibility chains</a> with more than one element. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModelAvailabilityVisibilityChains() { return nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0; }
    /** indicates whether the implementation supports the {@code ShaderViewportIndex} SPIR-V capability enabling variables decorated with the {@code ViewportIndex} built-in to be exported from vertex or tessellation evaluation shaders. If this feature is not enabled, the {@code ViewportIndex} built-in decoration <b>must</b> not be used on outputs in vertex or tessellation evaluation shaders. */
    @NativeType("VkBool32")
    public boolean shaderOutputViewportIndex() { return nshaderOutputViewportIndex(address()) != 0; }
    /** indicates whether the implementation supports the {@code ShaderLayer} SPIR-V capability enabling variables decorated with the {@code Layer} built-in to be exported from vertex or tessellation evaluation shaders. If this feature is not enabled, the {@code Layer} built-in decoration <b>must</b> not be used on outputs in vertex or tessellation evaluation shaders. */
    @NativeType("VkBool32")
    public boolean shaderOutputLayer() { return nshaderOutputLayer(address()) != 0; }
    /** if {@link VK10#VK_TRUE TRUE}, the “Id” operand of {@code OpGroupNonUniformBroadcast} <b>can</b> be dynamically uniform within a subgroup, and the “Index” operand of {@code OpGroupNonUniformQuadBroadcast} <b>can</b> be dynamically uniform within the derivative group. If it is {@link VK10#VK_FALSE FALSE}, these operands <b>must</b> be constants. */
    @NativeType("VkBool32")
    public boolean subgroupBroadcastDynamicId() { return nsubgroupBroadcastDynamicId(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan12Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan12Features sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVulkan12Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #samplerMirrorClampToEdge} field. */
    public VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdge(@NativeType("VkBool32") boolean value) { nsamplerMirrorClampToEdge(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #drawIndirectCount} field. */
    public VkPhysicalDeviceVulkan12Features drawIndirectCount(@NativeType("VkBool32") boolean value) { ndrawIndirectCount(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #storageBuffer8BitAccess} field. */
    public VkPhysicalDeviceVulkan12Features storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #uniformAndStorageBuffer8BitAccess} field. */
    public VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #storagePushConstant8} field. */
    public VkPhysicalDeviceVulkan12Features storagePushConstant8(@NativeType("VkBool32") boolean value) { nstoragePushConstant8(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderBufferInt64Atomics} field. */
    public VkPhysicalDeviceVulkan12Features shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSharedInt64Atomics} field. */
    public VkPhysicalDeviceVulkan12Features shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderFloat16} field. */
    public VkPhysicalDeviceVulkan12Features shaderFloat16(@NativeType("VkBool32") boolean value) { nshaderFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderInt8} field. */
    public VkPhysicalDeviceVulkan12Features shaderInt8(@NativeType("VkBool32") boolean value) { nshaderInt8(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorIndexing} field. */
    public VkPhysicalDeviceVulkan12Features descriptorIndexing(@NativeType("VkBool32") boolean value) { ndescriptorIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderInputAttachmentArrayDynamicIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderUniformTexelBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageTexelBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderUniformBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSampledImageArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageImageArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderInputAttachmentArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderUniformTexelBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageTexelBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingUniformBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingSampledImageUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingStorageImageUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingStorageBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingUpdateUnusedWhilePending} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingPartiallyBound} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingVariableDescriptorCount} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #runtimeDescriptorArray} field. */
    public VkPhysicalDeviceVulkan12Features runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #samplerFilterMinmax} field. */
    public VkPhysicalDeviceVulkan12Features samplerFilterMinmax(@NativeType("VkBool32") boolean value) { nsamplerFilterMinmax(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #scalarBlockLayout} field. */
    public VkPhysicalDeviceVulkan12Features scalarBlockLayout(@NativeType("VkBool32") boolean value) { nscalarBlockLayout(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #imagelessFramebuffer} field. */
    public VkPhysicalDeviceVulkan12Features imagelessFramebuffer(@NativeType("VkBool32") boolean value) { nimagelessFramebuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #uniformBufferStandardLayout} field. */
    public VkPhysicalDeviceVulkan12Features uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSubgroupExtendedTypes} field. */
    public VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #separateDepthStencilLayouts} field. */
    public VkPhysicalDeviceVulkan12Features separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) { nseparateDepthStencilLayouts(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #hostQueryReset} field. */
    public VkPhysicalDeviceVulkan12Features hostQueryReset(@NativeType("VkBool32") boolean value) { nhostQueryReset(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #timelineSemaphore} field. */
    public VkPhysicalDeviceVulkan12Features timelineSemaphore(@NativeType("VkBool32") boolean value) { ntimelineSemaphore(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bufferDeviceAddress} field. */
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddress(@NativeType("VkBool32") boolean value) { nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bufferDeviceAddressCaptureReplay} field. */
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bufferDeviceAddressMultiDevice} field. */
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vulkanMemoryModel} field. */
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModel(@NativeType("VkBool32") boolean value) { nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vulkanMemoryModelDeviceScope} field. */
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vulkanMemoryModelAvailabilityVisibilityChains} field. */
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderOutputViewportIndex} field. */
    public VkPhysicalDeviceVulkan12Features shaderOutputViewportIndex(@NativeType("VkBool32") boolean value) { nshaderOutputViewportIndex(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderOutputLayer} field. */
    public VkPhysicalDeviceVulkan12Features shaderOutputLayer(@NativeType("VkBool32") boolean value) { nshaderOutputLayer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #subgroupBroadcastDynamicId} field. */
    public VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicId(@NativeType("VkBool32") boolean value) { nsubgroupBroadcastDynamicId(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan12Features set(
        int sType,
        long pNext,
        boolean samplerMirrorClampToEdge,
        boolean drawIndirectCount,
        boolean storageBuffer8BitAccess,
        boolean uniformAndStorageBuffer8BitAccess,
        boolean storagePushConstant8,
        boolean shaderBufferInt64Atomics,
        boolean shaderSharedInt64Atomics,
        boolean shaderFloat16,
        boolean shaderInt8,
        boolean descriptorIndexing,
        boolean shaderInputAttachmentArrayDynamicIndexing,
        boolean shaderUniformTexelBufferArrayDynamicIndexing,
        boolean shaderStorageTexelBufferArrayDynamicIndexing,
        boolean shaderUniformBufferArrayNonUniformIndexing,
        boolean shaderSampledImageArrayNonUniformIndexing,
        boolean shaderStorageBufferArrayNonUniformIndexing,
        boolean shaderStorageImageArrayNonUniformIndexing,
        boolean shaderInputAttachmentArrayNonUniformIndexing,
        boolean shaderUniformTexelBufferArrayNonUniformIndexing,
        boolean shaderStorageTexelBufferArrayNonUniformIndexing,
        boolean descriptorBindingUniformBufferUpdateAfterBind,
        boolean descriptorBindingSampledImageUpdateAfterBind,
        boolean descriptorBindingStorageImageUpdateAfterBind,
        boolean descriptorBindingStorageBufferUpdateAfterBind,
        boolean descriptorBindingUniformTexelBufferUpdateAfterBind,
        boolean descriptorBindingStorageTexelBufferUpdateAfterBind,
        boolean descriptorBindingUpdateUnusedWhilePending,
        boolean descriptorBindingPartiallyBound,
        boolean descriptorBindingVariableDescriptorCount,
        boolean runtimeDescriptorArray,
        boolean samplerFilterMinmax,
        boolean scalarBlockLayout,
        boolean imagelessFramebuffer,
        boolean uniformBufferStandardLayout,
        boolean shaderSubgroupExtendedTypes,
        boolean separateDepthStencilLayouts,
        boolean hostQueryReset,
        boolean timelineSemaphore,
        boolean bufferDeviceAddress,
        boolean bufferDeviceAddressCaptureReplay,
        boolean bufferDeviceAddressMultiDevice,
        boolean vulkanMemoryModel,
        boolean vulkanMemoryModelDeviceScope,
        boolean vulkanMemoryModelAvailabilityVisibilityChains,
        boolean shaderOutputViewportIndex,
        boolean shaderOutputLayer,
        boolean subgroupBroadcastDynamicId
    ) {
        sType(sType);
        pNext(pNext);
        samplerMirrorClampToEdge(samplerMirrorClampToEdge);
        drawIndirectCount(drawIndirectCount);
        storageBuffer8BitAccess(storageBuffer8BitAccess);
        uniformAndStorageBuffer8BitAccess(uniformAndStorageBuffer8BitAccess);
        storagePushConstant8(storagePushConstant8);
        shaderBufferInt64Atomics(shaderBufferInt64Atomics);
        shaderSharedInt64Atomics(shaderSharedInt64Atomics);
        shaderFloat16(shaderFloat16);
        shaderInt8(shaderInt8);
        descriptorIndexing(descriptorIndexing);
        shaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing);
        shaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing);
        shaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing);
        shaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing);
        shaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing);
        shaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing);
        shaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing);
        shaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing);
        shaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing);
        shaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing);
        descriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind);
        descriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind);
        descriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind);
        descriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind);
        descriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind);
        descriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind);
        descriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending);
        descriptorBindingPartiallyBound(descriptorBindingPartiallyBound);
        descriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount);
        runtimeDescriptorArray(runtimeDescriptorArray);
        samplerFilterMinmax(samplerFilterMinmax);
        scalarBlockLayout(scalarBlockLayout);
        imagelessFramebuffer(imagelessFramebuffer);
        uniformBufferStandardLayout(uniformBufferStandardLayout);
        shaderSubgroupExtendedTypes(shaderSubgroupExtendedTypes);
        separateDepthStencilLayouts(separateDepthStencilLayouts);
        hostQueryReset(hostQueryReset);
        timelineSemaphore(timelineSemaphore);
        bufferDeviceAddress(bufferDeviceAddress);
        bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay);
        bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice);
        vulkanMemoryModel(vulkanMemoryModel);
        vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);
        vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains);
        shaderOutputViewportIndex(shaderOutputViewportIndex);
        shaderOutputLayer(shaderOutputLayer);
        subgroupBroadcastDynamicId(subgroupBroadcastDynamicId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan12Features set(VkPhysicalDeviceVulkan12Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan12Features malloc() {
        return wrap(VkPhysicalDeviceVulkan12Features.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan12Features calloc() {
        return wrap(VkPhysicalDeviceVulkan12Features.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan12Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVulkan12Features.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan12Features} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan12Features create(long address) {
        return wrap(VkPhysicalDeviceVulkan12Features.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan12Features createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVulkan12Features.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan12Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan12Features.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan12Features malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan12Features.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan12Features calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan12Features.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan12Features.PNEXT); }
    /** Unsafe version of {@link #samplerMirrorClampToEdge}. */
    public static int nsamplerMirrorClampToEdge(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SAMPLERMIRRORCLAMPTOEDGE); }
    /** Unsafe version of {@link #drawIndirectCount}. */
    public static int ndrawIndirectCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DRAWINDIRECTCOUNT); }
    /** Unsafe version of {@link #storageBuffer8BitAccess}. */
    public static int nstorageBuffer8BitAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.STORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess}. */
    public static int nuniformAndStorageBuffer8BitAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.UNIFORMANDSTORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #storagePushConstant8}. */
    public static int nstoragePushConstant8(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.STORAGEPUSHCONSTANT8); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics}. */
    public static int nshaderBufferInt64Atomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERBUFFERINT64ATOMICS); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics}. */
    public static int nshaderSharedInt64Atomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSHAREDINT64ATOMICS); }
    /** Unsafe version of {@link #shaderFloat16}. */
    public static int nshaderFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERFLOAT16); }
    /** Unsafe version of {@link #shaderInt8}. */
    public static int nshaderInt8(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERINT8); }
    /** Unsafe version of {@link #descriptorIndexing}. */
    public static int ndescriptorIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORINDEXING); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayDynamicIndexing}. */
    public static int nshaderInputAttachmentArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayDynamicIndexing}. */
    public static int nshaderUniformTexelBufferArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayDynamicIndexing}. */
    public static int nshaderStorageTexelBufferArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexing}. */
    public static int nshaderUniformBufferArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexing}. */
    public static int nshaderSampledImageArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexing}. */
    public static int nshaderStorageBufferArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexing}. */
    public static int nshaderStorageImageArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexing}. */
    public static int nshaderInputAttachmentArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayNonUniformIndexing}. */
    public static int nshaderUniformTexelBufferArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayNonUniformIndexing}. */
    public static int nshaderStorageTexelBufferArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #descriptorBindingUniformBufferUpdateAfterBind}. */
    public static int ndescriptorBindingUniformBufferUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingSampledImageUpdateAfterBind}. */
    public static int ndescriptorBindingSampledImageUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageImageUpdateAfterBind}. */
    public static int ndescriptorBindingStorageImageUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageBufferUpdateAfterBind}. */
    public static int ndescriptorBindingStorageBufferUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingUniformTexelBufferUpdateAfterBind}. */
    public static int ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageTexelBufferUpdateAfterBind}. */
    public static int ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingUpdateUnusedWhilePending}. */
    public static int ndescriptorBindingUpdateUnusedWhilePending(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING); }
    /** Unsafe version of {@link #descriptorBindingPartiallyBound}. */
    public static int ndescriptorBindingPartiallyBound(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGPARTIALLYBOUND); }
    /** Unsafe version of {@link #descriptorBindingVariableDescriptorCount}. */
    public static int ndescriptorBindingVariableDescriptorCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT); }
    /** Unsafe version of {@link #runtimeDescriptorArray}. */
    public static int nruntimeDescriptorArray(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.RUNTIMEDESCRIPTORARRAY); }
    /** Unsafe version of {@link #samplerFilterMinmax}. */
    public static int nsamplerFilterMinmax(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SAMPLERFILTERMINMAX); }
    /** Unsafe version of {@link #scalarBlockLayout}. */
    public static int nscalarBlockLayout(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SCALARBLOCKLAYOUT); }
    /** Unsafe version of {@link #imagelessFramebuffer}. */
    public static int nimagelessFramebuffer(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.IMAGELESSFRAMEBUFFER); }
    /** Unsafe version of {@link #uniformBufferStandardLayout}. */
    public static int nuniformBufferStandardLayout(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.UNIFORMBUFFERSTANDARDLAYOUT); }
    /** Unsafe version of {@link #shaderSubgroupExtendedTypes}. */
    public static int nshaderSubgroupExtendedTypes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSUBGROUPEXTENDEDTYPES); }
    /** Unsafe version of {@link #separateDepthStencilLayouts}. */
    public static int nseparateDepthStencilLayouts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SEPARATEDEPTHSTENCILLAYOUTS); }
    /** Unsafe version of {@link #hostQueryReset}. */
    public static int nhostQueryReset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.HOSTQUERYRESET); }
    /** Unsafe version of {@link #timelineSemaphore}. */
    public static int ntimelineSemaphore(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.TIMELINESEMAPHORE); }
    /** Unsafe version of {@link #bufferDeviceAddress}. */
    public static int nbufferDeviceAddress(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESS); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay}. */
    public static int nbufferDeviceAddressCaptureReplay(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSCAPTUREREPLAY); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice}. */
    public static int nbufferDeviceAddressMultiDevice(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSMULTIDEVICE); }
    /** Unsafe version of {@link #vulkanMemoryModel}. */
    public static int nvulkanMemoryModel(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODEL); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope}. */
    public static int nvulkanMemoryModelDeviceScope(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELDEVICESCOPE); }
    /** Unsafe version of {@link #vulkanMemoryModelAvailabilityVisibilityChains}. */
    public static int nvulkanMemoryModelAvailabilityVisibilityChains(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS); }
    /** Unsafe version of {@link #shaderOutputViewportIndex}. */
    public static int nshaderOutputViewportIndex(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADEROUTPUTVIEWPORTINDEX); }
    /** Unsafe version of {@link #shaderOutputLayer}. */
    public static int nshaderOutputLayer(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADEROUTPUTLAYER); }
    /** Unsafe version of {@link #subgroupBroadcastDynamicId}. */
    public static int nsubgroupBroadcastDynamicId(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan12Features.SUBGROUPBROADCASTDYNAMICID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan12Features.PNEXT, value); }
    /** Unsafe version of {@link #samplerMirrorClampToEdge(boolean) samplerMirrorClampToEdge}. */
    public static void nsamplerMirrorClampToEdge(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SAMPLERMIRRORCLAMPTOEDGE, value); }
    /** Unsafe version of {@link #drawIndirectCount(boolean) drawIndirectCount}. */
    public static void ndrawIndirectCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DRAWINDIRECTCOUNT, value); }
    /** Unsafe version of {@link #storageBuffer8BitAccess(boolean) storageBuffer8BitAccess}. */
    public static void nstorageBuffer8BitAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.STORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess(boolean) uniformAndStorageBuffer8BitAccess}. */
    public static void nuniformAndStorageBuffer8BitAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.UNIFORMANDSTORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #storagePushConstant8(boolean) storagePushConstant8}. */
    public static void nstoragePushConstant8(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.STORAGEPUSHCONSTANT8, value); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics(boolean) shaderBufferInt64Atomics}. */
    public static void nshaderBufferInt64Atomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERBUFFERINT64ATOMICS, value); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics(boolean) shaderSharedInt64Atomics}. */
    public static void nshaderSharedInt64Atomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSHAREDINT64ATOMICS, value); }
    /** Unsafe version of {@link #shaderFloat16(boolean) shaderFloat16}. */
    public static void nshaderFloat16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERFLOAT16, value); }
    /** Unsafe version of {@link #shaderInt8(boolean) shaderInt8}. */
    public static void nshaderInt8(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERINT8, value); }
    /** Unsafe version of {@link #descriptorIndexing(boolean) descriptorIndexing}. */
    public static void ndescriptorIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORINDEXING, value); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayDynamicIndexing(boolean) shaderInputAttachmentArrayDynamicIndexing}. */
    public static void nshaderInputAttachmentArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayDynamicIndexing(boolean) shaderUniformTexelBufferArrayDynamicIndexing}. */
    public static void nshaderUniformTexelBufferArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayDynamicIndexing(boolean) shaderStorageTexelBufferArrayDynamicIndexing}. */
    public static void nshaderStorageTexelBufferArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexing(boolean) shaderUniformBufferArrayNonUniformIndexing}. */
    public static void nshaderUniformBufferArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexing(boolean) shaderSampledImageArrayNonUniformIndexing}. */
    public static void nshaderSampledImageArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexing(boolean) shaderStorageBufferArrayNonUniformIndexing}. */
    public static void nshaderStorageBufferArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexing(boolean) shaderStorageImageArrayNonUniformIndexing}. */
    public static void nshaderStorageImageArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexing(boolean) shaderInputAttachmentArrayNonUniformIndexing}. */
    public static void nshaderInputAttachmentArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayNonUniformIndexing(boolean) shaderUniformTexelBufferArrayNonUniformIndexing}. */
    public static void nshaderUniformTexelBufferArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayNonUniformIndexing(boolean) shaderStorageTexelBufferArrayNonUniformIndexing}. */
    public static void nshaderStorageTexelBufferArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #descriptorBindingUniformBufferUpdateAfterBind(boolean) descriptorBindingUniformBufferUpdateAfterBind}. */
    public static void ndescriptorBindingUniformBufferUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingSampledImageUpdateAfterBind(boolean) descriptorBindingSampledImageUpdateAfterBind}. */
    public static void ndescriptorBindingSampledImageUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageImageUpdateAfterBind(boolean) descriptorBindingStorageImageUpdateAfterBind}. */
    public static void ndescriptorBindingStorageImageUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageBufferUpdateAfterBind(boolean) descriptorBindingStorageBufferUpdateAfterBind}. */
    public static void ndescriptorBindingStorageBufferUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingUniformTexelBufferUpdateAfterBind(boolean) descriptorBindingUniformTexelBufferUpdateAfterBind}. */
    public static void ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageTexelBufferUpdateAfterBind(boolean) descriptorBindingStorageTexelBufferUpdateAfterBind}. */
    public static void ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingUpdateUnusedWhilePending(boolean) descriptorBindingUpdateUnusedWhilePending}. */
    public static void ndescriptorBindingUpdateUnusedWhilePending(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING, value); }
    /** Unsafe version of {@link #descriptorBindingPartiallyBound(boolean) descriptorBindingPartiallyBound}. */
    public static void ndescriptorBindingPartiallyBound(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGPARTIALLYBOUND, value); }
    /** Unsafe version of {@link #descriptorBindingVariableDescriptorCount(boolean) descriptorBindingVariableDescriptorCount}. */
    public static void ndescriptorBindingVariableDescriptorCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #runtimeDescriptorArray(boolean) runtimeDescriptorArray}. */
    public static void nruntimeDescriptorArray(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.RUNTIMEDESCRIPTORARRAY, value); }
    /** Unsafe version of {@link #samplerFilterMinmax(boolean) samplerFilterMinmax}. */
    public static void nsamplerFilterMinmax(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SAMPLERFILTERMINMAX, value); }
    /** Unsafe version of {@link #scalarBlockLayout(boolean) scalarBlockLayout}. */
    public static void nscalarBlockLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SCALARBLOCKLAYOUT, value); }
    /** Unsafe version of {@link #imagelessFramebuffer(boolean) imagelessFramebuffer}. */
    public static void nimagelessFramebuffer(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.IMAGELESSFRAMEBUFFER, value); }
    /** Unsafe version of {@link #uniformBufferStandardLayout(boolean) uniformBufferStandardLayout}. */
    public static void nuniformBufferStandardLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.UNIFORMBUFFERSTANDARDLAYOUT, value); }
    /** Unsafe version of {@link #shaderSubgroupExtendedTypes(boolean) shaderSubgroupExtendedTypes}. */
    public static void nshaderSubgroupExtendedTypes(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADERSUBGROUPEXTENDEDTYPES, value); }
    /** Unsafe version of {@link #separateDepthStencilLayouts(boolean) separateDepthStencilLayouts}. */
    public static void nseparateDepthStencilLayouts(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SEPARATEDEPTHSTENCILLAYOUTS, value); }
    /** Unsafe version of {@link #hostQueryReset(boolean) hostQueryReset}. */
    public static void nhostQueryReset(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.HOSTQUERYRESET, value); }
    /** Unsafe version of {@link #timelineSemaphore(boolean) timelineSemaphore}. */
    public static void ntimelineSemaphore(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.TIMELINESEMAPHORE, value); }
    /** Unsafe version of {@link #bufferDeviceAddress(boolean) bufferDeviceAddress}. */
    public static void nbufferDeviceAddress(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESS, value); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay(boolean) bufferDeviceAddressCaptureReplay}. */
    public static void nbufferDeviceAddressCaptureReplay(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSCAPTUREREPLAY, value); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice(boolean) bufferDeviceAddressMultiDevice}. */
    public static void nbufferDeviceAddressMultiDevice(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSMULTIDEVICE, value); }
    /** Unsafe version of {@link #vulkanMemoryModel(boolean) vulkanMemoryModel}. */
    public static void nvulkanMemoryModel(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODEL, value); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope(boolean) vulkanMemoryModelDeviceScope}. */
    public static void nvulkanMemoryModelDeviceScope(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELDEVICESCOPE, value); }
    /** Unsafe version of {@link #vulkanMemoryModelAvailabilityVisibilityChains(boolean) vulkanMemoryModelAvailabilityVisibilityChains}. */
    public static void nvulkanMemoryModelAvailabilityVisibilityChains(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS, value); }
    /** Unsafe version of {@link #shaderOutputViewportIndex(boolean) shaderOutputViewportIndex}. */
    public static void nshaderOutputViewportIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADEROUTPUTVIEWPORTINDEX, value); }
    /** Unsafe version of {@link #shaderOutputLayer(boolean) shaderOutputLayer}. */
    public static void nshaderOutputLayer(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SHADEROUTPUTLAYER, value); }
    /** Unsafe version of {@link #subgroupBroadcastDynamicId(boolean) subgroupBroadcastDynamicId}. */
    public static void nsubgroupBroadcastDynamicId(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan12Features.SUBGROUPBROADCASTDYNAMICID, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan12Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan12Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan12Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan12Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan12Features.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan12Features#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVulkan12Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan12Features.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan12Features.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#samplerMirrorClampToEdge} field. */
        @NativeType("VkBool32")
        public boolean samplerMirrorClampToEdge() { return VkPhysicalDeviceVulkan12Features.nsamplerMirrorClampToEdge(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#drawIndirectCount} field. */
        @NativeType("VkBool32")
        public boolean drawIndirectCount() { return VkPhysicalDeviceVulkan12Features.ndrawIndirectCount(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#storageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean storageBuffer8BitAccess() { return VkPhysicalDeviceVulkan12Features.nstorageBuffer8BitAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#uniformAndStorageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer8BitAccess() { return VkPhysicalDeviceVulkan12Features.nuniformAndStorageBuffer8BitAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#storagePushConstant8} field. */
        @NativeType("VkBool32")
        public boolean storagePushConstant8() { return VkPhysicalDeviceVulkan12Features.nstoragePushConstant8(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderBufferInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferInt64Atomics() { return VkPhysicalDeviceVulkan12Features.nshaderBufferInt64Atomics(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderSharedInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedInt64Atomics() { return VkPhysicalDeviceVulkan12Features.nshaderSharedInt64Atomics(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat16() { return VkPhysicalDeviceVulkan12Features.nshaderFloat16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderInt8} field. */
        @NativeType("VkBool32")
        public boolean shaderInt8() { return VkPhysicalDeviceVulkan12Features.nshaderInt8(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorIndexing} field. */
        @NativeType("VkBool32")
        public boolean descriptorIndexing() { return VkPhysicalDeviceVulkan12Features.ndescriptorIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderInputAttachmentArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayDynamicIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderUniformTexelBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderStorageTexelBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderUniformBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderUniformBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderSampledImageArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderSampledImageArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderStorageBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderStorageBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderStorageImageArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderStorageImageArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderInputAttachmentArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderUniformTexelBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderStorageTexelBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingUniformBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUniformBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingSampledImageUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingSampledImageUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingStorageImageUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageImageUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingStorageBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingUpdateUnusedWhilePending} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUpdateUnusedWhilePending() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingUpdateUnusedWhilePending(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingPartiallyBound} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingPartiallyBound() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingPartiallyBound(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingVariableDescriptorCount} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingVariableDescriptorCount() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingVariableDescriptorCount(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#runtimeDescriptorArray} field. */
        @NativeType("VkBool32")
        public boolean runtimeDescriptorArray() { return VkPhysicalDeviceVulkan12Features.nruntimeDescriptorArray(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#samplerFilterMinmax} field. */
        @NativeType("VkBool32")
        public boolean samplerFilterMinmax() { return VkPhysicalDeviceVulkan12Features.nsamplerFilterMinmax(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#scalarBlockLayout} field. */
        @NativeType("VkBool32")
        public boolean scalarBlockLayout() { return VkPhysicalDeviceVulkan12Features.nscalarBlockLayout(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#imagelessFramebuffer} field. */
        @NativeType("VkBool32")
        public boolean imagelessFramebuffer() { return VkPhysicalDeviceVulkan12Features.nimagelessFramebuffer(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#uniformBufferStandardLayout} field. */
        @NativeType("VkBool32")
        public boolean uniformBufferStandardLayout() { return VkPhysicalDeviceVulkan12Features.nuniformBufferStandardLayout(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderSubgroupExtendedTypes} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupExtendedTypes() { return VkPhysicalDeviceVulkan12Features.nshaderSubgroupExtendedTypes(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#separateDepthStencilLayouts} field. */
        @NativeType("VkBool32")
        public boolean separateDepthStencilLayouts() { return VkPhysicalDeviceVulkan12Features.nseparateDepthStencilLayouts(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#hostQueryReset} field. */
        @NativeType("VkBool32")
        public boolean hostQueryReset() { return VkPhysicalDeviceVulkan12Features.nhostQueryReset(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#timelineSemaphore} field. */
        @NativeType("VkBool32")
        public boolean timelineSemaphore() { return VkPhysicalDeviceVulkan12Features.ntimelineSemaphore(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#bufferDeviceAddress} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddress() { return VkPhysicalDeviceVulkan12Features.nbufferDeviceAddress(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#bufferDeviceAddressCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressCaptureReplay() { return VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressCaptureReplay(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#bufferDeviceAddressMultiDevice} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressMultiDevice() { return VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressMultiDevice(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#vulkanMemoryModel} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModel() { return VkPhysicalDeviceVulkan12Features.nvulkanMemoryModel(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#vulkanMemoryModelDeviceScope} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModelDeviceScope() { return VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelDeviceScope(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#vulkanMemoryModelAvailabilityVisibilityChains} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModelAvailabilityVisibilityChains() { return VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderOutputViewportIndex} field. */
        @NativeType("VkBool32")
        public boolean shaderOutputViewportIndex() { return VkPhysicalDeviceVulkan12Features.nshaderOutputViewportIndex(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#shaderOutputLayer} field. */
        @NativeType("VkBool32")
        public boolean shaderOutputLayer() { return VkPhysicalDeviceVulkan12Features.nshaderOutputLayer(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan12Features#subgroupBroadcastDynamicId} field. */
        @NativeType("VkBool32")
        public boolean subgroupBroadcastDynamicId() { return VkPhysicalDeviceVulkan12Features.nsubgroupBroadcastDynamicId(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#sType} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan12Features.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES} value to the {@link VkPhysicalDeviceVulkan12Features#sType} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#pNext} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan12Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#samplerMirrorClampToEdge} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer samplerMirrorClampToEdge(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nsamplerMirrorClampToEdge(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#drawIndirectCount} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer drawIndirectCount(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndrawIndirectCount(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#storageBuffer8BitAccess} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#uniformAndStorageBuffer8BitAccess} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#storagePushConstant8} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer storagePushConstant8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nstoragePushConstant8(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderBufferInt64Atomics} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderSharedInt64Atomics} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderFloat16} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderInt8} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderInt8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderInt8(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderInputAttachmentArrayDynamicIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderUniformTexelBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderStorageTexelBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderUniformBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderSampledImageArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderStorageBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderStorageImageArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderInputAttachmentArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderUniformTexelBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderStorageTexelBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingUniformBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingSampledImageUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingStorageImageUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingStorageBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingUpdateUnusedWhilePending} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingPartiallyBound} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#descriptorBindingVariableDescriptorCount} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#runtimeDescriptorArray} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#samplerFilterMinmax} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer samplerFilterMinmax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nsamplerFilterMinmax(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#scalarBlockLayout} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer scalarBlockLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nscalarBlockLayout(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#imagelessFramebuffer} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer imagelessFramebuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nimagelessFramebuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#uniformBufferStandardLayout} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderSubgroupExtendedTypes} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#separateDepthStencilLayouts} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nseparateDepthStencilLayouts(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#hostQueryReset} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer hostQueryReset(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nhostQueryReset(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#timelineSemaphore} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer timelineSemaphore(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ntimelineSemaphore(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#bufferDeviceAddress} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#bufferDeviceAddressCaptureReplay} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#bufferDeviceAddressMultiDevice} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#vulkanMemoryModel} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer vulkanMemoryModel(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#vulkanMemoryModelDeviceScope} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#vulkanMemoryModelAvailabilityVisibilityChains} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderOutputViewportIndex} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderOutputViewportIndex(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderOutputViewportIndex(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#shaderOutputLayer} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderOutputLayer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderOutputLayer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan12Features#subgroupBroadcastDynamicId} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer subgroupBroadcastDynamicId(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nsubgroupBroadcastDynamicId(address(), value ? 1 : 0); return this; }

    }

}