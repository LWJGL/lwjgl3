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
 * Structure describing descriptor indexing features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDescriptorIndexingFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDescriptorIndexingFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDescriptorIndexingFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
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
 * }</code></pre>
 */
public class VkPhysicalDeviceDescriptorIndexingFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
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
        RUNTIMEDESCRIPTORARRAY;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING = layout.offsetof(2);
        SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(3);
        SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(4);
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(5);
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(6);
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(7);
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(8);
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING = layout.offsetof(9);
        SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(10);
        SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(11);
        DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND = layout.offsetof(12);
        DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND = layout.offsetof(13);
        DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND = layout.offsetof(14);
        DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND = layout.offsetof(15);
        DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND = layout.offsetof(16);
        DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND = layout.offsetof(17);
        DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING = layout.offsetof(18);
        DESCRIPTORBINDINGPARTIALLYBOUND = layout.offsetof(19);
        DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT = layout.offsetof(20);
        RUNTIMEDESCRIPTORARRAY = layout.offsetof(21);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorIndexingFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorIndexingFeatures(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderInputAttachmentArrayDynamicIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderUniformTexelBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageTexelBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderUniformBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSampledImageArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageImageArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderInputAttachmentArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderUniformTexelBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageTexelBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingUniformBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingSampledImageUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingStorageImageUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingStorageBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingUpdateUnusedWhilePending} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingPartiallyBound} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingVariableDescriptorCount} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #runtimeDescriptorArray} field. */
    public VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorIndexingFeatures set(
        int sType,
        long pNext,
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
        boolean runtimeDescriptorArray
    ) {
        sType(sType);
        pNext(pNext);
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

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorIndexingFeatures set(VkPhysicalDeviceDescriptorIndexingFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingFeatures malloc() {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingFeatures calloc() {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorIndexingFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDescriptorIndexingFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorIndexingFeatures create(long address) {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDescriptorIndexingFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorIndexingFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorIndexingFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayDynamicIndexing}. */
    public static int nshaderInputAttachmentArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayDynamicIndexing}. */
    public static int nshaderUniformTexelBufferArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayDynamicIndexing}. */
    public static int nshaderStorageTexelBufferArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexing}. */
    public static int nshaderUniformBufferArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexing}. */
    public static int nshaderSampledImageArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexing}. */
    public static int nshaderStorageBufferArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexing}. */
    public static int nshaderStorageImageArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexing}. */
    public static int nshaderInputAttachmentArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayNonUniformIndexing}. */
    public static int nshaderUniformTexelBufferArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayNonUniformIndexing}. */
    public static int nshaderStorageTexelBufferArrayNonUniformIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #descriptorBindingUniformBufferUpdateAfterBind}. */
    public static int ndescriptorBindingUniformBufferUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingSampledImageUpdateAfterBind}. */
    public static int ndescriptorBindingSampledImageUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageImageUpdateAfterBind}. */
    public static int ndescriptorBindingStorageImageUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageBufferUpdateAfterBind}. */
    public static int ndescriptorBindingStorageBufferUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingUniformTexelBufferUpdateAfterBind}. */
    public static int ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageTexelBufferUpdateAfterBind}. */
    public static int ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingUpdateUnusedWhilePending}. */
    public static int ndescriptorBindingUpdateUnusedWhilePending(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING); }
    /** Unsafe version of {@link #descriptorBindingPartiallyBound}. */
    public static int ndescriptorBindingPartiallyBound(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGPARTIALLYBOUND); }
    /** Unsafe version of {@link #descriptorBindingVariableDescriptorCount}. */
    public static int ndescriptorBindingVariableDescriptorCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT); }
    /** Unsafe version of {@link #runtimeDescriptorArray}. */
    public static int nruntimeDescriptorArray(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.RUNTIMEDESCRIPTORARRAY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorIndexingFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayDynamicIndexing(boolean) shaderInputAttachmentArrayDynamicIndexing}. */
    public static void nshaderInputAttachmentArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayDynamicIndexing(boolean) shaderUniformTexelBufferArrayDynamicIndexing}. */
    public static void nshaderUniformTexelBufferArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayDynamicIndexing(boolean) shaderStorageTexelBufferArrayDynamicIndexing}. */
    public static void nshaderStorageTexelBufferArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexing(boolean) shaderUniformBufferArrayNonUniformIndexing}. */
    public static void nshaderUniformBufferArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexing(boolean) shaderSampledImageArrayNonUniformIndexing}. */
    public static void nshaderSampledImageArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexing(boolean) shaderStorageBufferArrayNonUniformIndexing}. */
    public static void nshaderStorageBufferArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexing(boolean) shaderStorageImageArrayNonUniformIndexing}. */
    public static void nshaderStorageImageArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexing(boolean) shaderInputAttachmentArrayNonUniformIndexing}. */
    public static void nshaderInputAttachmentArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayNonUniformIndexing(boolean) shaderUniformTexelBufferArrayNonUniformIndexing}. */
    public static void nshaderUniformTexelBufferArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayNonUniformIndexing(boolean) shaderStorageTexelBufferArrayNonUniformIndexing}. */
    public static void nshaderStorageTexelBufferArrayNonUniformIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #descriptorBindingUniformBufferUpdateAfterBind(boolean) descriptorBindingUniformBufferUpdateAfterBind}. */
    public static void ndescriptorBindingUniformBufferUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingSampledImageUpdateAfterBind(boolean) descriptorBindingSampledImageUpdateAfterBind}. */
    public static void ndescriptorBindingSampledImageUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageImageUpdateAfterBind(boolean) descriptorBindingStorageImageUpdateAfterBind}. */
    public static void ndescriptorBindingStorageImageUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageBufferUpdateAfterBind(boolean) descriptorBindingStorageBufferUpdateAfterBind}. */
    public static void ndescriptorBindingStorageBufferUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingUniformTexelBufferUpdateAfterBind(boolean) descriptorBindingUniformTexelBufferUpdateAfterBind}. */
    public static void ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageTexelBufferUpdateAfterBind(boolean) descriptorBindingStorageTexelBufferUpdateAfterBind}. */
    public static void ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingUpdateUnusedWhilePending(boolean) descriptorBindingUpdateUnusedWhilePending}. */
    public static void ndescriptorBindingUpdateUnusedWhilePending(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING, value); }
    /** Unsafe version of {@link #descriptorBindingPartiallyBound(boolean) descriptorBindingPartiallyBound}. */
    public static void ndescriptorBindingPartiallyBound(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGPARTIALLYBOUND, value); }
    /** Unsafe version of {@link #descriptorBindingVariableDescriptorCount(boolean) descriptorBindingVariableDescriptorCount}. */
    public static void ndescriptorBindingVariableDescriptorCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #runtimeDescriptorArray(boolean) runtimeDescriptorArray}. */
    public static void nruntimeDescriptorArray(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorIndexingFeatures.RUNTIMEDESCRIPTORARRAY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorIndexingFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorIndexingFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorIndexingFeatures ELEMENT_FACTORY = VkPhysicalDeviceDescriptorIndexingFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorIndexingFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorIndexingFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDescriptorIndexingFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorIndexingFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorIndexingFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderInputAttachmentArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayDynamicIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderUniformTexelBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderStorageTexelBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderUniformBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderSampledImageArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderSampledImageArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderStorageBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderStorageImageArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageImageArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderInputAttachmentArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderUniformTexelBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderStorageTexelBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingUniformBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUniformBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingSampledImageUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingSampledImageUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingStorageImageUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageImageUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingStorageBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingUpdateUnusedWhilePending} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUpdateUnusedWhilePending() { return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUpdateUnusedWhilePending(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingPartiallyBound} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingPartiallyBound() { return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingPartiallyBound(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingVariableDescriptorCount} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingVariableDescriptorCount() { return VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingVariableDescriptorCount(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorIndexingFeatures#runtimeDescriptorArray} field. */
        @NativeType("VkBool32")
        public boolean runtimeDescriptorArray() { return VkPhysicalDeviceDescriptorIndexingFeatures.nruntimeDescriptorArray(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#sType} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES} value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#sType} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#pNext} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorIndexingFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderInputAttachmentArrayDynamicIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderUniformTexelBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderStorageTexelBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderUniformBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderSampledImageArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderStorageBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderStorageImageArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderInputAttachmentArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderUniformTexelBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#shaderStorageTexelBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingUniformBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingSampledImageUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingStorageImageUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingStorageBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingUpdateUnusedWhilePending} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingPartiallyBound} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#descriptorBindingVariableDescriptorCount} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorIndexingFeatures#runtimeDescriptorArray} field. */
        public VkPhysicalDeviceDescriptorIndexingFeatures.Buffer runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeatures.nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }

    }

}