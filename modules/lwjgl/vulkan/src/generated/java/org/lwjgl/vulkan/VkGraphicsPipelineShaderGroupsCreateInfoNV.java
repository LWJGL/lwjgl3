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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created multi shader group pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>When referencing shader groups by index, groups defined in the referenced pipelines are treated as if they were defined as additional entries in {@code pGroups}. They are appended in the order they appear in the {@code pPipelines} array and in the {@code pGroups} array when those pipelines were defined.</p>
 * 
 * <p>The application <b>must</b> maintain the lifetime of all such referenced pipelines based on the pipelines that make use of them.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code groupCount} <b>must</b> be at least 1 and as maximum {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::maxGraphicsShaderGroupCount}</li>
 * <li>The sum of {@code groupCount} including those groups added from referenced {@code pPipelines} <b>must</b> also be as maximum {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::maxGraphicsShaderGroupCount}</li>
 * <li>The state of the first element of {@code pGroups} <b>must</b> match its equivalent within the parent&#8217;s {@link VkGraphicsPipelineCreateInfo}</li>
 * <li>Each element of {@code pGroups} <b>must</b> in combination with the rest of the pipeline state yield a valid state configuration</li>
 * <li>All elements of {@code pGroups} <b>must</b> use the same shader stage combinations unless any mesh shader stage is used, then either combination of task and mesh or just mesh shader is valid</li>
 * <li>Mesh and regular primitive shading stages cannot be mixed across {@code pGroups}</li>
 * <li>Each element of {@code pPipelines} <b>must</b> have been created with identical state to the pipeline currently created except the state that can be overridden by {@link VkGraphicsShaderGroupCreateInfoNV}</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV}</li>
 * <li>{@code pGroups} <b>must</b> be a valid pointer to an array of {@code groupCount} valid {@link VkGraphicsShaderGroupCreateInfoNV} structures</li>
 * <li>If {@code pipelineCount} is not 0, {@code pPipelines} <b>must</b> be a valid pointer to an array of {@code pipelineCount} valid {@code VkPipeline} handles</li>
 * <li>{@code groupCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsShaderGroupCreateInfoNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #groupCount};
 *     {@link VkGraphicsShaderGroupCreateInfoNV VkGraphicsShaderGroupCreateInfoNV} const * {@link #pGroups};
 *     uint32_t {@link #pipelineCount};
 *     VkPipeline const * {@link #pPipelines};
 * }</code></pre>
 */
public class VkGraphicsPipelineShaderGroupsCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GROUPCOUNT,
        PGROUPS,
        PIPELINECOUNT,
        PPIPELINES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GROUPCOUNT = layout.offsetof(2);
        PGROUPS = layout.offsetof(3);
        PIPELINECOUNT = layout.offsetof(4);
        PPIPELINES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of elements in the {@code pGroups} array. */
    @NativeType("uint32_t")
    public int groupCount() { return ngroupCount(address()); }
    /** an array of {@link VkGraphicsShaderGroupCreateInfoNV} values specifying which state of the original {@link VkGraphicsPipelineCreateInfo} each shader group overrides. */
    @NativeType("VkGraphicsShaderGroupCreateInfoNV const *")
    public VkGraphicsShaderGroupCreateInfoNV.Buffer pGroups() { return npGroups(address()); }
    /** the number of elements in the {@code pPipelines} array. */
    @NativeType("uint32_t")
    public int pipelineCount() { return npipelineCount(address()); }
    /** an array of graphics {@code VkPipeline}, which are referenced within the created pipeline, including all their shader groups. */
    @Nullable
    @NativeType("VkPipeline const *")
    public LongBuffer pPipelines() { return npPipelines(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} to the {@link #pGroups} field. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pGroups(@NativeType("VkGraphicsShaderGroupCreateInfoNV const *") VkGraphicsShaderGroupCreateInfoNV.Buffer value) { npGroups(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pPipelines} field. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pPipelines(@Nullable @NativeType("VkPipeline const *") LongBuffer value) { npPipelines(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV set(
        int sType,
        long pNext,
        VkGraphicsShaderGroupCreateInfoNV.Buffer pGroups,
        @Nullable LongBuffer pPipelines
    ) {
        sType(sType);
        pNext(pNext);
        pGroups(pGroups);
        pPipelines(pPipelines);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGraphicsPipelineShaderGroupsCreateInfoNV set(VkGraphicsPipelineShaderGroupsCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV malloc() {
        return wrap(VkGraphicsPipelineShaderGroupsCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV calloc() {
        return wrap(VkGraphicsPipelineShaderGroupsCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGraphicsPipelineShaderGroupsCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance for the specified memory address. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV create(long address) {
        return wrap(VkGraphicsPipelineShaderGroupsCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkGraphicsPipelineShaderGroupsCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV mallocStack(MemoryStack stack) {
        return wrap(VkGraphicsPipelineShaderGroupsCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV callocStack(MemoryStack stack) {
        return wrap(VkGraphicsPipelineShaderGroupsCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #groupCount}. */
    public static int ngroupCount(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.GROUPCOUNT); }
    /** Unsafe version of {@link #pGroups}. */
    public static VkGraphicsShaderGroupCreateInfoNV.Buffer npGroups(long struct) { return VkGraphicsShaderGroupCreateInfoNV.create(memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PGROUPS), ngroupCount(struct)); }
    /** Unsafe version of {@link #pipelineCount}. */
    public static int npipelineCount(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PIPELINECOUNT); }
    /** Unsafe version of {@link #pPipelines() pPipelines}. */
    @Nullable public static LongBuffer npPipelines(long struct) { return memLongBufferSafe(memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PPIPELINES), npipelineCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PNEXT, value); }
    /** Sets the specified value to the {@code groupCount} field of the specified {@code struct}. */
    public static void ngroupCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.GROUPCOUNT, value); }
    /** Unsafe version of {@link #pGroups(VkGraphicsShaderGroupCreateInfoNV.Buffer) pGroups}. */
    public static void npGroups(long struct, VkGraphicsShaderGroupCreateInfoNV.Buffer value) { memPutAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PGROUPS, value.address()); ngroupCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code pipelineCount} field of the specified {@code struct}. */
    public static void npipelineCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PIPELINECOUNT, value); }
    /** Unsafe version of {@link #pPipelines(LongBuffer) pPipelines}. */
    public static void npPipelines(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PPIPELINES, memAddressSafe(value)); npipelineCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int groupCount = ngroupCount(struct);
        long pGroups = memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PGROUPS);
        check(pGroups);
        VkGraphicsShaderGroupCreateInfoNV.validate(pGroups, groupCount);
        if (npipelineCount(struct) != 0) {
            check(memGetAddress(struct + VkGraphicsPipelineShaderGroupsCreateInfoNV.PPIPELINES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkGraphicsPipelineShaderGroupsCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkGraphicsPipelineShaderGroupsCreateInfoNV, Buffer> implements NativeResource {

        private static final VkGraphicsPipelineShaderGroupsCreateInfoNV ELEMENT_FACTORY = VkGraphicsPipelineShaderGroupsCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkGraphicsPipelineShaderGroupsCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#groupCount} field. */
        @NativeType("uint32_t")
        public int groupCount() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.ngroupCount(address()); }
        /** @return a {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} view of the struct array pointed to by the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#pGroups} field. */
        @NativeType("VkGraphicsShaderGroupCreateInfoNV const *")
        public VkGraphicsShaderGroupCreateInfoNV.Buffer pGroups() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.npGroups(address()); }
        /** @return the value of the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#pipelineCount} field. */
        @NativeType("uint32_t")
        public int pipelineCount() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.npipelineCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#pPipelines} field. */
        @Nullable
        @NativeType("VkPipeline const *")
        public LongBuffer pPipelines() { return VkGraphicsPipelineShaderGroupsCreateInfoNV.npPipelines(address()); }

        /** Sets the specified value to the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#sType} field. */
        public VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#pNext} field. */
        public VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} to the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#pGroups} field. */
        public VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer pGroups(@NativeType("VkGraphicsShaderGroupCreateInfoNV const *") VkGraphicsShaderGroupCreateInfoNV.Buffer value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.npGroups(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#pPipelines} field. */
        public VkGraphicsPipelineShaderGroupsCreateInfoNV.Buffer pPipelines(@Nullable @NativeType("VkPipeline const *") LongBuffer value) { VkGraphicsPipelineShaderGroupsCreateInfoNV.npPipelines(address(), value); return this; }

    }

}