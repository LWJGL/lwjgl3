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
 * <p>If the {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2KHR}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorIndexing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code shaderInputAttachmentArrayDynamicIndexing} &ndash; indicates whether arrays of input attachments <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code InputAttachmentArrayDynamicIndexingEXT} capability.</li>
 * <li>{@code shaderUniformTexelBufferArrayDynamicIndexing} &ndash; indicates whether arrays of uniform texel buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformTexelBufferArrayDynamicIndexingEXT} capability.</li>
 * <li>{@code shaderStorageTexelBufferArrayDynamicIndexing} &ndash; indicates whether arrays of storage texel buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageTexelBufferArrayDynamicIndexingEXT} capability.</li>
 * <li>{@code shaderUniformBufferArrayNonUniformIndexing} &ndash; indicates whether arrays of uniform buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformBufferArrayNonUniformIndexingEXT} capability.</li>
 * <li>{@code shaderSampledImageArrayNonUniformIndexing} &ndash; indicates whether arrays of samplers or sampled images <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, or {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code SampledImageArrayNonUniformIndexingEXT} capability.</li>
 * <li>{@code shaderStorageBufferArrayNonUniformIndexing} &ndash; indicates whether arrays of storage buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageBufferArrayNonUniformIndexingEXT} capability.</li>
 * <li>{@code shaderStorageImageArrayNonUniformIndexing} &ndash; indicates whether arrays of storage images <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageArrayNonUniformIndexingEXT} capability.</li>
 * <li>{@code shaderInputAttachmentArrayNonUniformIndexing} &ndash; indicates whether arrays of input attachments <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code InputAttachmentArrayNonUniformIndexingEXT} capability.</li>
 * <li>{@code shaderUniformTexelBufferArrayNonUniformIndexing} &ndash; indicates whether arrays of uniform texel buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformTexelBufferArrayNonUniformIndexingEXT} capability.</li>
 * <li>{@code shaderStorageTexelBufferArrayNonUniformIndexing} &ndash; indicates whether arrays of storage texel buffers <b>can</b> be indexed by non-uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} <b>must</b> not be indexed by non-uniform integer expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageTexelBufferArrayNonUniformIndexingEXT} capability.</li>
 * <li>{@code descriptorBindingUniformBufferUpdateAfterBind} &ndash; indicates whether the implementation supports updating uniform buffer descriptors after a set is bound. If this feature is not enabled, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}.</li>
 * <li>{@code descriptorBindingSampledImageUpdateAfterBind} &ndash; indicates whether the implementation supports updating sampled image descriptors after a set is bound. If this feature is not enabled, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, or {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}.</li>
 * <li>{@code descriptorBindingStorageImageUpdateAfterBind} &ndash; indicates whether the implementation supports updating storage image descriptors after a set is bound. If this feature is not enabled, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}.</li>
 * <li>{@code descriptorBindingStorageBufferUpdateAfterBind} &ndash; indicates whether the implementation supports updating storage buffer descriptors after a set is bound. If this feature is not enabled, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}.</li>
 * <li>{@code descriptorBindingUniformTexelBufferUpdateAfterBind} &ndash; indicates whether the implementation supports updating uniform texel buffer descriptors after a set is bound. If this feature is not enabled, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}.</li>
 * <li>{@code descriptorBindingStorageTexelBufferUpdateAfterBind} &ndash; indicates whether the implementation supports updating storage texel buffer descriptors after a set is bound. If this feature is not enabled, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT} <b>must</b> not be used with {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}.</li>
 * <li>{@code descriptorBindingUpdateUnusedWhilePending} &ndash; indicates whether the implementation supports updating descriptors while the set is in use. If this feature is not enabled, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT} <b>must</b> not be used.</li>
 * <li>{@code descriptorBindingPartiallyBound} &ndash; indicates whether the implementation supports statically using a descriptor set binding in which some descriptors are not valid. If this feature is not enabled, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT} <b>must</b> not be used.</li>
 * <li>{@code descriptorBindingVariableDescriptorCount} &ndash; indicates whether the implementation supports descriptor sets with a variable-sized last binding. If this feature is not enabled, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT} <b>must</b> not be used.</li>
 * <li>{@code runtimeDescriptorArray} &ndash; indicates whether the implementation supports the SPIR-V RuntimeDescriptorArrayEXT capability. If this feature is not enabled, descriptors <b>must</b> not be declared in runtime arrays.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDescriptorIndexingFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderInputAttachmentArrayDynamicIndexing;
 *     VkBool32 shaderUniformTexelBufferArrayDynamicIndexing;
 *     VkBool32 shaderStorageTexelBufferArrayDynamicIndexing;
 *     VkBool32 shaderUniformBufferArrayNonUniformIndexing;
 *     VkBool32 shaderSampledImageArrayNonUniformIndexing;
 *     VkBool32 shaderStorageBufferArrayNonUniformIndexing;
 *     VkBool32 shaderStorageImageArrayNonUniformIndexing;
 *     VkBool32 shaderInputAttachmentArrayNonUniformIndexing;
 *     VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing;
 *     VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing;
 *     VkBool32 descriptorBindingUniformBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingSampledImageUpdateAfterBind;
 *     VkBool32 descriptorBindingStorageImageUpdateAfterBind;
 *     VkBool32 descriptorBindingStorageBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingUpdateUnusedWhilePending;
 *     VkBool32 descriptorBindingPartiallyBound;
 *     VkBool32 descriptorBindingVariableDescriptorCount;
 *     VkBool32 runtimeDescriptorArray;
 * }</code></pre>
 */
public class VkPhysicalDeviceDescriptorIndexingFeaturesEXT extends Struct implements NativeResource {

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

    VkPhysicalDeviceDescriptorIndexingFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayDynamicIndexing() { return nshaderInputAttachmentArrayDynamicIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayDynamicIndexing() { return nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayDynamicIndexing() { return nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexing() { return nshaderUniformBufferArrayNonUniformIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderSampledImageArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexing() { return nshaderSampledImageArrayNonUniformIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexing() { return nshaderStorageBufferArrayNonUniformIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderStorageImageArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexing() { return nshaderStorageImageArrayNonUniformIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexing() { return nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayNonUniformIndexing() { return nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0; }
    /** Returns the value of the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayNonUniformIndexing() { return nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingUniformBufferUpdateAfterBind() { return ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingSampledImageUpdateAfterBind() { return ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageImageUpdateAfterBind() { return ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageBufferUpdateAfterBind() { return ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() { return ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() { return ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingUpdateUnusedWhilePending} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingUpdateUnusedWhilePending() { return ndescriptorBindingUpdateUnusedWhilePending(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingPartiallyBound} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingPartiallyBound() { return ndescriptorBindingPartiallyBound(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingVariableDescriptorCount} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingVariableDescriptorCount() { return ndescriptorBindingVariableDescriptorCount(address()) != 0; }
    /** Returns the value of the {@code runtimeDescriptorArray} field. */
    @NativeType("VkBool32")
    public boolean runtimeDescriptorArray() { return nruntimeDescriptorArray(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSampledImageArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingUpdateUnusedWhilePending} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingPartiallyBound} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingVariableDescriptorCount} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code runtimeDescriptorArray} field. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT set(
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
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT set(VkPhysicalDeviceDescriptorIndexingFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT create() {
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayDynamicIndexing}. */
    public static int nshaderInputAttachmentArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayDynamicIndexing}. */
    public static int nshaderUniformTexelBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayDynamicIndexing}. */
    public static int nshaderStorageTexelBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexing}. */
    public static int nshaderUniformBufferArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexing}. */
    public static int nshaderSampledImageArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexing}. */
    public static int nshaderStorageBufferArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexing}. */
    public static int nshaderStorageImageArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexing}. */
    public static int nshaderInputAttachmentArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayNonUniformIndexing}. */
    public static int nshaderUniformTexelBufferArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayNonUniformIndexing}. */
    public static int nshaderStorageTexelBufferArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #descriptorBindingUniformBufferUpdateAfterBind}. */
    public static int ndescriptorBindingUniformBufferUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingSampledImageUpdateAfterBind}. */
    public static int ndescriptorBindingSampledImageUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageImageUpdateAfterBind}. */
    public static int ndescriptorBindingStorageImageUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageBufferUpdateAfterBind}. */
    public static int ndescriptorBindingStorageBufferUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingUniformTexelBufferUpdateAfterBind}. */
    public static int ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageTexelBufferUpdateAfterBind}. */
    public static int ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingUpdateUnusedWhilePending}. */
    public static int ndescriptorBindingUpdateUnusedWhilePending(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING); }
    /** Unsafe version of {@link #descriptorBindingPartiallyBound}. */
    public static int ndescriptorBindingPartiallyBound(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGPARTIALLYBOUND); }
    /** Unsafe version of {@link #descriptorBindingVariableDescriptorCount}. */
    public static int ndescriptorBindingVariableDescriptorCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT); }
    /** Unsafe version of {@link #runtimeDescriptorArray}. */
    public static int nruntimeDescriptorArray(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.RUNTIMEDESCRIPTORARRAY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayDynamicIndexing(boolean) shaderInputAttachmentArrayDynamicIndexing}. */
    public static void nshaderInputAttachmentArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayDynamicIndexing(boolean) shaderUniformTexelBufferArrayDynamicIndexing}. */
    public static void nshaderUniformTexelBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayDynamicIndexing(boolean) shaderStorageTexelBufferArrayDynamicIndexing}. */
    public static void nshaderStorageTexelBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexing(boolean) shaderUniformBufferArrayNonUniformIndexing}. */
    public static void nshaderUniformBufferArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexing(boolean) shaderSampledImageArrayNonUniformIndexing}. */
    public static void nshaderSampledImageArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexing(boolean) shaderStorageBufferArrayNonUniformIndexing}. */
    public static void nshaderStorageBufferArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexing(boolean) shaderStorageImageArrayNonUniformIndexing}. */
    public static void nshaderStorageImageArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexing(boolean) shaderInputAttachmentArrayNonUniformIndexing}. */
    public static void nshaderInputAttachmentArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayNonUniformIndexing(boolean) shaderUniformTexelBufferArrayNonUniformIndexing}. */
    public static void nshaderUniformTexelBufferArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayNonUniformIndexing(boolean) shaderStorageTexelBufferArrayNonUniformIndexing}. */
    public static void nshaderStorageTexelBufferArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #descriptorBindingUniformBufferUpdateAfterBind(boolean) descriptorBindingUniformBufferUpdateAfterBind}. */
    public static void ndescriptorBindingUniformBufferUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingSampledImageUpdateAfterBind(boolean) descriptorBindingSampledImageUpdateAfterBind}. */
    public static void ndescriptorBindingSampledImageUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageImageUpdateAfterBind(boolean) descriptorBindingStorageImageUpdateAfterBind}. */
    public static void ndescriptorBindingStorageImageUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageBufferUpdateAfterBind(boolean) descriptorBindingStorageBufferUpdateAfterBind}. */
    public static void ndescriptorBindingStorageBufferUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingUniformTexelBufferUpdateAfterBind(boolean) descriptorBindingUniformTexelBufferUpdateAfterBind}. */
    public static void ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageTexelBufferUpdateAfterBind(boolean) descriptorBindingStorageTexelBufferUpdateAfterBind}. */
    public static void ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingUpdateUnusedWhilePending(boolean) descriptorBindingUpdateUnusedWhilePending}. */
    public static void ndescriptorBindingUpdateUnusedWhilePending(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING, value); }
    /** Unsafe version of {@link #descriptorBindingPartiallyBound(boolean) descriptorBindingPartiallyBound}. */
    public static void ndescriptorBindingPartiallyBound(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGPARTIALLYBOUND, value); }
    /** Unsafe version of {@link #descriptorBindingVariableDescriptorCount(boolean) descriptorBindingVariableDescriptorCount}. */
    public static void ndescriptorBindingVariableDescriptorCount(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #runtimeDescriptorArray(boolean) runtimeDescriptorArray}. */
    public static void nruntimeDescriptorArray(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorIndexingFeaturesEXT.RUNTIMEDESCRIPTORARRAY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorIndexingFeaturesEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPhysicalDeviceDescriptorIndexingFeaturesEXT newInstance(long address) {
            return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.npNext(address()); }
        /** Returns the value of the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayDynamicIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayDynamicIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformBufferArrayNonUniformIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderSampledImageArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderSampledImageArrayNonUniformIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageBufferArrayNonUniformIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderStorageImageArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageImageArrayNonUniformIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0; }
        /** Returns the value of the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUniformBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingSampledImageUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageImageUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingUpdateUnusedWhilePending} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUpdateUnusedWhilePending() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUpdateUnusedWhilePending(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingPartiallyBound} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingPartiallyBound() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingPartiallyBound(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingVariableDescriptorCount} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingVariableDescriptorCount() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingVariableDescriptorCount(address()) != 0; }
        /** Returns the value of the {@code runtimeDescriptorArray} field. */
        @NativeType("VkBool32")
        public boolean runtimeDescriptorArray() { return VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nruntimeDescriptorArray(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSampledImageArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingUpdateUnusedWhilePending} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingPartiallyBound} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingVariableDescriptorCount} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code runtimeDescriptorArray} field. */
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }

    }

}