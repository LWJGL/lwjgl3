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
 * Structure describing the Vulkan 1.1 features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVulkan11Features} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceVulkan11Features} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkan11Features {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #storageBuffer16BitAccess};
 *     VkBool32 {@link #uniformAndStorageBuffer16BitAccess};
 *     VkBool32 {@link #storagePushConstant16};
 *     VkBool32 {@link #storageInputOutput16};
 *     VkBool32 {@link #multiview};
 *     VkBool32 {@link #multiviewGeometryShader};
 *     VkBool32 {@link #multiviewTessellationShader};
 *     VkBool32 {@link #variablePointersStorageBuffer};
 *     VkBool32 {@link #variablePointers};
 *     VkBool32 {@link #protectedMemory};
 *     VkBool32 {@link #samplerYcbcrConversion};
 *     VkBool32 {@link #shaderDrawParameters};
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkan11Features extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STORAGEBUFFER16BITACCESS,
        UNIFORMANDSTORAGEBUFFER16BITACCESS,
        STORAGEPUSHCONSTANT16,
        STORAGEINPUTOUTPUT16,
        MULTIVIEW,
        MULTIVIEWGEOMETRYSHADER,
        MULTIVIEWTESSELLATIONSHADER,
        VARIABLEPOINTERSSTORAGEBUFFER,
        VARIABLEPOINTERS,
        PROTECTEDMEMORY,
        SAMPLERYCBCRCONVERSION,
        SHADERDRAWPARAMETERS;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFER16BITACCESS = layout.offsetof(2);
        UNIFORMANDSTORAGEBUFFER16BITACCESS = layout.offsetof(3);
        STORAGEPUSHCONSTANT16 = layout.offsetof(4);
        STORAGEINPUTOUTPUT16 = layout.offsetof(5);
        MULTIVIEW = layout.offsetof(6);
        MULTIVIEWGEOMETRYSHADER = layout.offsetof(7);
        MULTIVIEWTESSELLATIONSHADER = layout.offsetof(8);
        VARIABLEPOINTERSSTORAGEBUFFER = layout.offsetof(9);
        VARIABLEPOINTERS = layout.offsetof(10);
        PROTECTEDMEMORY = layout.offsetof(11);
        SAMPLERYCBCRCONVERSION = layout.offsetof(12);
        SHADERDRAWPARAMETERS = layout.offsetof(13);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan11Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan11Features(ByteBuffer container) {
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
    /** specifies whether objects in the {@code StorageBuffer}, {@code ShaderRecordBufferKHR}, or {@code PhysicalStorageBuffer} storage class with the {@code Block} decoration <b>can</b> have 16-bit integer and 16-bit floating-point members. If this feature is not enabled, 16-bit integer or 16-bit floating-point members <b>must</b> not be used in such objects. This also specifies whether shader modules <b>can</b> declare the {@code StorageBuffer16BitAccess} capability. */
    @NativeType("VkBool32")
    public boolean storageBuffer16BitAccess() { return nstorageBuffer16BitAccess(address()) != 0; }
    /** specifies whether objects in the {@code Uniform} storage class with the {@code Block} decoration <b>can</b> have 16-bit integer and 16-bit floating-point members. If this feature is not enabled, 16-bit integer or 16-bit floating-point members <b>must</b> not be used in such objects. This also specifies whether shader modules <b>can</b> declare the {@code UniformAndStorageBuffer16BitAccess} capability. */
    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer16BitAccess() { return nuniformAndStorageBuffer16BitAccess(address()) != 0; }
    /** specifies whether objects in the {@code PushConstant} storage class <b>can</b> have 16-bit integer and 16-bit floating-point members. If this feature is not enabled, 16-bit integer or floating-point members <b>must</b> not be used in such objects. This also specifies whether shader modules <b>can</b> declare the {@code StoragePushConstant16} capability. */
    @NativeType("VkBool32")
    public boolean storagePushConstant16() { return nstoragePushConstant16(address()) != 0; }
    /** specifies whether objects in the {@code Input} and {@code Output} storage classes <b>can</b> have 16-bit integer and 16-bit floating-point members. If this feature is not enabled, 16-bit integer or 16-bit floating-point members <b>must</b> not be used in such objects. This also specifies whether shader modules <b>can</b> declare the {@code StorageInputOutput16} capability. */
    @NativeType("VkBool32")
    public boolean storageInputOutput16() { return nstorageInputOutput16(address()) != 0; }
    /** specifies whether the implementation supports multiview rendering within a render pass. If this feature is not enabled, the view mask of each subpass <b>must</b> always be zero. */
    @NativeType("VkBool32")
    public boolean multiview() { return nmultiview(address()) != 0; }
    /** specifies whether the implementation supports multiview rendering within a render pass, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#geometry">geometry shaders</a>. If this feature is not enabled, then a pipeline compiled against a subpass with a non-zero view mask <b>must</b> not include a geometry shader. */
    @NativeType("VkBool32")
    public boolean multiviewGeometryShader() { return nmultiviewGeometryShader(address()) != 0; }
    /** specifies whether the implementation supports multiview rendering within a render pass, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#tessellation">tessellation shaders</a>. If this feature is not enabled, then a pipeline compiled against a subpass with a non-zero view mask <b>must</b> not include any tessellation shaders. */
    @NativeType("VkBool32")
    public boolean multiviewTessellationShader() { return nmultiviewTessellationShader(address()) != 0; }
    /** specifies whether the implementation supports the SPIR-V {@code VariablePointersStorageBuffer} capability. When this feature is not enabled, shader modules <b>must</b> not declare the {@code SPV_KHR_variable_pointers} extension or the {@code VariablePointersStorageBuffer} capability. */
    @NativeType("VkBool32")
    public boolean variablePointersStorageBuffer() { return nvariablePointersStorageBuffer(address()) != 0; }
    /** specifies whether the implementation supports the SPIR-V {@code VariablePointers} capability. When this feature is not enabled, shader modules <b>must</b> not declare the {@code VariablePointers} capability. */
    @NativeType("VkBool32")
    public boolean variablePointers() { return nvariablePointers(address()) != 0; }
    /** specifies whether protected memory is supported. */
    @NativeType("VkBool32")
    public boolean protectedMemory() { return nprotectedMemory(address()) != 0; }
    /** specifies whether the implementation supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>. If {@code samplerYcbcrConversion} is {@link VK10#VK_FALSE FALSE}, sampler Y′C<sub>B</sub>C<sub>R</sub> conversion is not supported, and samplers using sampler Y′C<sub>B</sub>C<sub>R</sub> conversion <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean samplerYcbcrConversion() { return nsamplerYcbcrConversion(address()) != 0; }
    /** specifies whether the implementation supports the SPIR-V {@code DrawParameters} capability. When this feature is not enabled, shader modules <b>must</b> not declare the {@code SPV_KHR_shader_draw_parameters} extension or the {@code DrawParameters} capability. */
    @NativeType("VkBool32")
    public boolean shaderDrawParameters() { return nshaderDrawParameters(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan11Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan11Features sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVulkan11Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #storageBuffer16BitAccess} field. */
    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #uniformAndStorageBuffer16BitAccess} field. */
    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #storagePushConstant16} field. */
    public VkPhysicalDeviceVulkan11Features storagePushConstant16(@NativeType("VkBool32") boolean value) { nstoragePushConstant16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #storageInputOutput16} field. */
    public VkPhysicalDeviceVulkan11Features storageInputOutput16(@NativeType("VkBool32") boolean value) { nstorageInputOutput16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #multiview} field. */
    public VkPhysicalDeviceVulkan11Features multiview(@NativeType("VkBool32") boolean value) { nmultiview(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #multiviewGeometryShader} field. */
    public VkPhysicalDeviceVulkan11Features multiviewGeometryShader(@NativeType("VkBool32") boolean value) { nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #multiviewTessellationShader} field. */
    public VkPhysicalDeviceVulkan11Features multiviewTessellationShader(@NativeType("VkBool32") boolean value) { nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #variablePointersStorageBuffer} field. */
    public VkPhysicalDeviceVulkan11Features variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #variablePointers} field. */
    public VkPhysicalDeviceVulkan11Features variablePointers(@NativeType("VkBool32") boolean value) { nvariablePointers(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #protectedMemory} field. */
    public VkPhysicalDeviceVulkan11Features protectedMemory(@NativeType("VkBool32") boolean value) { nprotectedMemory(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #samplerYcbcrConversion} field. */
    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversion(@NativeType("VkBool32") boolean value) { nsamplerYcbcrConversion(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderDrawParameters} field. */
    public VkPhysicalDeviceVulkan11Features shaderDrawParameters(@NativeType("VkBool32") boolean value) { nshaderDrawParameters(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan11Features set(
        int sType,
        long pNext,
        boolean storageBuffer16BitAccess,
        boolean uniformAndStorageBuffer16BitAccess,
        boolean storagePushConstant16,
        boolean storageInputOutput16,
        boolean multiview,
        boolean multiviewGeometryShader,
        boolean multiviewTessellationShader,
        boolean variablePointersStorageBuffer,
        boolean variablePointers,
        boolean protectedMemory,
        boolean samplerYcbcrConversion,
        boolean shaderDrawParameters
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffer16BitAccess(storageBuffer16BitAccess);
        uniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess);
        storagePushConstant16(storagePushConstant16);
        storageInputOutput16(storageInputOutput16);
        multiview(multiview);
        multiviewGeometryShader(multiviewGeometryShader);
        multiviewTessellationShader(multiviewTessellationShader);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);
        protectedMemory(protectedMemory);
        samplerYcbcrConversion(samplerYcbcrConversion);
        shaderDrawParameters(shaderDrawParameters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan11Features set(VkPhysicalDeviceVulkan11Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan11Features malloc() {
        return wrap(VkPhysicalDeviceVulkan11Features.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan11Features calloc() {
        return wrap(VkPhysicalDeviceVulkan11Features.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan11Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVulkan11Features.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Features} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan11Features create(long address) {
        return wrap(VkPhysicalDeviceVulkan11Features.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan11Features createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVulkan11Features.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan11Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan11Features.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan11Features malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan11Features.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan11Features calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan11Features.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan11Features.PNEXT); }
    /** Unsafe version of {@link #storageBuffer16BitAccess}. */
    public static int nstorageBuffer16BitAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.STORAGEBUFFER16BITACCESS); }
    /** Unsafe version of {@link #uniformAndStorageBuffer16BitAccess}. */
    public static int nuniformAndStorageBuffer16BitAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.UNIFORMANDSTORAGEBUFFER16BITACCESS); }
    /** Unsafe version of {@link #storagePushConstant16}. */
    public static int nstoragePushConstant16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.STORAGEPUSHCONSTANT16); }
    /** Unsafe version of {@link #storageInputOutput16}. */
    public static int nstorageInputOutput16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.STORAGEINPUTOUTPUT16); }
    /** Unsafe version of {@link #multiview}. */
    public static int nmultiview(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.MULTIVIEW); }
    /** Unsafe version of {@link #multiviewGeometryShader}. */
    public static int nmultiviewGeometryShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.MULTIVIEWGEOMETRYSHADER); }
    /** Unsafe version of {@link #multiviewTessellationShader}. */
    public static int nmultiviewTessellationShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.MULTIVIEWTESSELLATIONSHADER); }
    /** Unsafe version of {@link #variablePointersStorageBuffer}. */
    public static int nvariablePointersStorageBuffer(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERSSTORAGEBUFFER); }
    /** Unsafe version of {@link #variablePointers}. */
    public static int nvariablePointers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERS); }
    /** Unsafe version of {@link #protectedMemory}. */
    public static int nprotectedMemory(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.PROTECTEDMEMORY); }
    /** Unsafe version of {@link #samplerYcbcrConversion}. */
    public static int nsamplerYcbcrConversion(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.SAMPLERYCBCRCONVERSION); }
    /** Unsafe version of {@link #shaderDrawParameters}. */
    public static int nshaderDrawParameters(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Features.SHADERDRAWPARAMETERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan11Features.PNEXT, value); }
    /** Unsafe version of {@link #storageBuffer16BitAccess(boolean) storageBuffer16BitAccess}. */
    public static void nstorageBuffer16BitAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.STORAGEBUFFER16BITACCESS, value); }
    /** Unsafe version of {@link #uniformAndStorageBuffer16BitAccess(boolean) uniformAndStorageBuffer16BitAccess}. */
    public static void nuniformAndStorageBuffer16BitAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.UNIFORMANDSTORAGEBUFFER16BITACCESS, value); }
    /** Unsafe version of {@link #storagePushConstant16(boolean) storagePushConstant16}. */
    public static void nstoragePushConstant16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.STORAGEPUSHCONSTANT16, value); }
    /** Unsafe version of {@link #storageInputOutput16(boolean) storageInputOutput16}. */
    public static void nstorageInputOutput16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.STORAGEINPUTOUTPUT16, value); }
    /** Unsafe version of {@link #multiview(boolean) multiview}. */
    public static void nmultiview(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.MULTIVIEW, value); }
    /** Unsafe version of {@link #multiviewGeometryShader(boolean) multiviewGeometryShader}. */
    public static void nmultiviewGeometryShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.MULTIVIEWGEOMETRYSHADER, value); }
    /** Unsafe version of {@link #multiviewTessellationShader(boolean) multiviewTessellationShader}. */
    public static void nmultiviewTessellationShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.MULTIVIEWTESSELLATIONSHADER, value); }
    /** Unsafe version of {@link #variablePointersStorageBuffer(boolean) variablePointersStorageBuffer}. */
    public static void nvariablePointersStorageBuffer(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERSSTORAGEBUFFER, value); }
    /** Unsafe version of {@link #variablePointers(boolean) variablePointers}. */
    public static void nvariablePointers(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERS, value); }
    /** Unsafe version of {@link #protectedMemory(boolean) protectedMemory}. */
    public static void nprotectedMemory(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.PROTECTEDMEMORY, value); }
    /** Unsafe version of {@link #samplerYcbcrConversion(boolean) samplerYcbcrConversion}. */
    public static void nsamplerYcbcrConversion(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.SAMPLERYCBCRCONVERSION, value); }
    /** Unsafe version of {@link #shaderDrawParameters(boolean) shaderDrawParameters}. */
    public static void nshaderDrawParameters(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Features.SHADERDRAWPARAMETERS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan11Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan11Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan11Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan11Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan11Features.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan11Features#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVulkan11Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan11Features.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan11Features.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#storageBuffer16BitAccess} field. */
        @NativeType("VkBool32")
        public boolean storageBuffer16BitAccess() { return VkPhysicalDeviceVulkan11Features.nstorageBuffer16BitAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#uniformAndStorageBuffer16BitAccess} field. */
        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer16BitAccess() { return VkPhysicalDeviceVulkan11Features.nuniformAndStorageBuffer16BitAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#storagePushConstant16} field. */
        @NativeType("VkBool32")
        public boolean storagePushConstant16() { return VkPhysicalDeviceVulkan11Features.nstoragePushConstant16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#storageInputOutput16} field. */
        @NativeType("VkBool32")
        public boolean storageInputOutput16() { return VkPhysicalDeviceVulkan11Features.nstorageInputOutput16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#multiview} field. */
        @NativeType("VkBool32")
        public boolean multiview() { return VkPhysicalDeviceVulkan11Features.nmultiview(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#multiviewGeometryShader} field. */
        @NativeType("VkBool32")
        public boolean multiviewGeometryShader() { return VkPhysicalDeviceVulkan11Features.nmultiviewGeometryShader(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#multiviewTessellationShader} field. */
        @NativeType("VkBool32")
        public boolean multiviewTessellationShader() { return VkPhysicalDeviceVulkan11Features.nmultiviewTessellationShader(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#variablePointersStorageBuffer} field. */
        @NativeType("VkBool32")
        public boolean variablePointersStorageBuffer() { return VkPhysicalDeviceVulkan11Features.nvariablePointersStorageBuffer(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#variablePointers} field. */
        @NativeType("VkBool32")
        public boolean variablePointers() { return VkPhysicalDeviceVulkan11Features.nvariablePointers(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#protectedMemory} field. */
        @NativeType("VkBool32")
        public boolean protectedMemory() { return VkPhysicalDeviceVulkan11Features.nprotectedMemory(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#samplerYcbcrConversion} field. */
        @NativeType("VkBool32")
        public boolean samplerYcbcrConversion() { return VkPhysicalDeviceVulkan11Features.nsamplerYcbcrConversion(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Features#shaderDrawParameters} field. */
        @NativeType("VkBool32")
        public boolean shaderDrawParameters() { return VkPhysicalDeviceVulkan11Features.nshaderDrawParameters(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#sType} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Features.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES} value to the {@link VkPhysicalDeviceVulkan11Features#sType} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#pNext} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan11Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#storageBuffer16BitAccess} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nstorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#uniformAndStorageBuffer16BitAccess} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#storagePushConstant16} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer storagePushConstant16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nstoragePushConstant16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#storageInputOutput16} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer storageInputOutput16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nstorageInputOutput16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#multiview} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer multiview(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nmultiview(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#multiviewGeometryShader} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer multiviewGeometryShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#multiviewTessellationShader} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer multiviewTessellationShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#variablePointersStorageBuffer} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#variablePointers} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer variablePointers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nvariablePointers(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#protectedMemory} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer protectedMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nprotectedMemory(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#samplerYcbcrConversion} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer samplerYcbcrConversion(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nsamplerYcbcrConversion(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Features#shaderDrawParameters} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer shaderDrawParameters(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nshaderDrawParameters(address(), value ? 1 : 0); return this; }

    }

}