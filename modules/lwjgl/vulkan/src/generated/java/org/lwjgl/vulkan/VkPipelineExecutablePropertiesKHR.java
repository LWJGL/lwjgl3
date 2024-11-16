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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure describing a pipeline executable.
 * 
 * <h5>Description</h5>
 * 
 * <p>Not all implementations have a 1:1 mapping between shader stages and pipeline executables and some implementations <b>may</b> reduce a given shader stage to fixed function hardware programming such that no pipeline executable is available. No guarantees are provided about the mapping between shader stages and pipeline executables and {@code stages} <b>should</b> be considered a best effort hint. Because the application <b>cannot</b> rely on the {@code stages} field to provide an exact description, {@code name} and {@code description} provide a human readable name and description which more accurately describes the given pipeline executable.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRPipelineExecutableProperties#vkGetPipelineExecutablePropertiesKHR GetPipelineExecutablePropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineExecutablePropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkShaderStageFlags {@link #stages};
 *     char {@link #name}[VK_MAX_DESCRIPTION_SIZE];
 *     char {@link #description}[VK_MAX_DESCRIPTION_SIZE];
 *     uint32_t {@link #subgroupSize};
 * }</code></pre>
 */
public class VkPipelineExecutablePropertiesKHR extends Struct<VkPipelineExecutablePropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGES,
        NAME,
        DESCRIPTION,
        SUBGROUPSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGES = layout.offsetof(2);
        NAME = layout.offsetof(3);
        DESCRIPTION = layout.offsetof(4);
        SUBGROUPSIZE = layout.offsetof(5);
    }

    protected VkPipelineExecutablePropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineExecutablePropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineExecutablePropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineExecutablePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineExecutablePropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of zero or more {@code VkShaderStageFlagBits} indicating which shader stages (if any) were principally used as inputs to compile this pipeline executable. */
    @NativeType("VkShaderStageFlags")
    public int stages() { return nstages(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a short human readable name for this pipeline executable. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a short human readable name for this pipeline executable. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description for this pipeline executable. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description for this pipeline executable. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** the subgroup size with which this pipeline executable is dispatched. */
    @NativeType("uint32_t")
    public int subgroupSize() { return nsubgroupSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineExecutablePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPipelineExecutablePropertiesKHR sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineExecutablePropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineExecutablePropertiesKHR set(
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
    public VkPipelineExecutablePropertiesKHR set(VkPipelineExecutablePropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutablePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutablePropertiesKHR malloc() {
        return new VkPipelineExecutablePropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineExecutablePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutablePropertiesKHR calloc() {
        return new VkPipelineExecutablePropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineExecutablePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineExecutablePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineExecutablePropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineExecutablePropertiesKHR} instance for the specified memory address. */
    public static VkPipelineExecutablePropertiesKHR create(long address) {
        return new VkPipelineExecutablePropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineExecutablePropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineExecutablePropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineExecutablePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutablePropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutablePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutablePropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutablePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutablePropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineExecutablePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutablePropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineExecutablePropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutablePropertiesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutablePropertiesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutablePropertiesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutablePropertiesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutablePropertiesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutablePropertiesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutablePropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutablePropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineExecutablePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutablePropertiesKHR malloc(MemoryStack stack) {
        return new VkPipelineExecutablePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineExecutablePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutablePropertiesKHR calloc(MemoryStack stack) {
        return new VkPipelineExecutablePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineExecutablePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutablePropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutablePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutablePropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineExecutablePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineExecutablePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #stages}. */
    public static int nstages(long struct) { return memGetInt(struct + VkPipelineExecutablePropertiesKHR.STAGES); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkPipelineExecutablePropertiesKHR.NAME, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkPipelineExecutablePropertiesKHR.NAME); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkPipelineExecutablePropertiesKHR.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkPipelineExecutablePropertiesKHR.DESCRIPTION); }
    /** Unsafe version of {@link #subgroupSize}. */
    public static int nsubgroupSize(long struct) { return memGetInt(struct + VkPipelineExecutablePropertiesKHR.SUBGROUPSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineExecutablePropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineExecutablePropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineExecutablePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineExecutablePropertiesKHR, Buffer> implements NativeResource {

        private static final VkPipelineExecutablePropertiesKHR ELEMENT_FACTORY = VkPipelineExecutablePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineExecutablePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineExecutablePropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineExecutablePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineExecutablePropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineExecutablePropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPipelineExecutablePropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineExecutablePropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPipelineExecutablePropertiesKHR#stages} field. */
        @NativeType("VkShaderStageFlags")
        public int stages() { return VkPipelineExecutablePropertiesKHR.nstages(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPipelineExecutablePropertiesKHR#name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() { return VkPipelineExecutablePropertiesKHR.nname(address()); }
        /** @return the null-terminated string stored in the {@link VkPipelineExecutablePropertiesKHR#name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() { return VkPipelineExecutablePropertiesKHR.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPipelineExecutablePropertiesKHR#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkPipelineExecutablePropertiesKHR.ndescription(address()); }
        /** @return the null-terminated string stored in the {@link VkPipelineExecutablePropertiesKHR#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkPipelineExecutablePropertiesKHR.ndescriptionString(address()); }
        /** @return the value of the {@link VkPipelineExecutablePropertiesKHR#subgroupSize} field. */
        @NativeType("uint32_t")
        public int subgroupSize() { return VkPipelineExecutablePropertiesKHR.nsubgroupSize(address()); }

        /** Sets the specified value to the {@link VkPipelineExecutablePropertiesKHR#sType} field. */
        public VkPipelineExecutablePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineExecutablePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR} value to the {@link VkPipelineExecutablePropertiesKHR#sType} field. */
        public VkPipelineExecutablePropertiesKHR.Buffer sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPipelineExecutablePropertiesKHR#pNext} field. */
        public VkPipelineExecutablePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPipelineExecutablePropertiesKHR.npNext(address(), value); return this; }

    }

}