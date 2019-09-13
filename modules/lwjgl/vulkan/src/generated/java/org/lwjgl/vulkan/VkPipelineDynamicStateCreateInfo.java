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
 * Structure specifying parameters of a newly created pipeline dynamic state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each element of {@code pDynamicStates} <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code dynamicStateCount} is not 0, {@code pDynamicStates} <b>must</b> be a valid pointer to an array of {@code dynamicStateCount} valid {@code VkDynamicState} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code dynamicStateCount} &ndash; the number of elements in the {@code pDynamicStates} array.</li>
 * <li>{@code pDynamicStates} &ndash; a pointer to an array of {@code VkDynamicState} values specifying which pieces of pipeline state will use the values from dynamic state commands rather than from pipeline state creation info.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineDynamicStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineDynamicStateCreateFlags flags;
 *     uint32_t dynamicStateCount;
 *     VkDynamicState const * pDynamicStates;
 * }</code></pre>
 */
public class VkPipelineDynamicStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DYNAMICSTATECOUNT,
        PDYNAMICSTATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DYNAMICSTATECOUNT = layout.offsetof(3);
        PDYNAMICSTATES = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineDynamicStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineDynamicStateCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkPipelineDynamicStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code dynamicStateCount} field. */
    @NativeType("uint32_t")
    public int dynamicStateCount() { return ndynamicStateCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDynamicStates} field. */
    @Nullable
    @NativeType("VkDynamicState const *")
    public IntBuffer pDynamicStates() { return npDynamicStates(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineDynamicStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineDynamicStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineDynamicStateCreateInfo flags(@NativeType("VkPipelineDynamicStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDynamicStates} field. */
    public VkPipelineDynamicStateCreateInfo pDynamicStates(@Nullable @NativeType("VkDynamicState const *") IntBuffer value) { npDynamicStates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineDynamicStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        @Nullable IntBuffer pDynamicStates
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDynamicStates(pDynamicStates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineDynamicStateCreateInfo set(VkPipelineDynamicStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineDynamicStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineDynamicStateCreateInfo malloc() {
        return wrap(VkPipelineDynamicStateCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineDynamicStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineDynamicStateCreateInfo calloc() {
        return wrap(VkPipelineDynamicStateCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineDynamicStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineDynamicStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineDynamicStateCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineDynamicStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineDynamicStateCreateInfo create(long address) {
        return wrap(VkPipelineDynamicStateCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineDynamicStateCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineDynamicStateCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDynamicStateCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDynamicStateCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDynamicStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineDynamicStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineDynamicStateCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineDynamicStateCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineDynamicStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineDynamicStateCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineDynamicStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineDynamicStateCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineDynamicStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDynamicStateCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkPipelineDynamicStateCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineDynamicStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDynamicStateCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkPipelineDynamicStateCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDynamicStateCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDynamicStateCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineDynamicStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDynamicStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineDynamicStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineDynamicStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineDynamicStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineDynamicStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #dynamicStateCount}. */
    public static int ndynamicStateCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineDynamicStateCreateInfo.DYNAMICSTATECOUNT); }
    /** Unsafe version of {@link #pDynamicStates() pDynamicStates}. */
    @Nullable public static IntBuffer npDynamicStates(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPipelineDynamicStateCreateInfo.PDYNAMICSTATES), ndynamicStateCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineDynamicStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineDynamicStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineDynamicStateCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code dynamicStateCount} field of the specified {@code struct}. */
    public static void ndynamicStateCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineDynamicStateCreateInfo.DYNAMICSTATECOUNT, value); }
    /** Unsafe version of {@link #pDynamicStates(IntBuffer) pDynamicStates}. */
    public static void npDynamicStates(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPipelineDynamicStateCreateInfo.PDYNAMICSTATES, memAddressSafe(value)); ndynamicStateCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndynamicStateCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineDynamicStateCreateInfo.PDYNAMICSTATES));
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

    /** An array of {@link VkPipelineDynamicStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineDynamicStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineDynamicStateCreateInfo ELEMENT_FACTORY = VkPipelineDynamicStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineDynamicStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineDynamicStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineDynamicStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineDynamicStateCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineDynamicStateCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineDynamicStateCreateFlags")
        public int flags() { return VkPipelineDynamicStateCreateInfo.nflags(address()); }
        /** Returns the value of the {@code dynamicStateCount} field. */
        @NativeType("uint32_t")
        public int dynamicStateCount() { return VkPipelineDynamicStateCreateInfo.ndynamicStateCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDynamicStates} field. */
        @Nullable
        @NativeType("VkDynamicState const *")
        public IntBuffer pDynamicStates() { return VkPipelineDynamicStateCreateInfo.npDynamicStates(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineDynamicStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineDynamicStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineDynamicStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineDynamicStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineDynamicStateCreateInfo.Buffer flags(@NativeType("VkPipelineDynamicStateCreateFlags") int value) { VkPipelineDynamicStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDynamicStates} field. */
        public VkPipelineDynamicStateCreateInfo.Buffer pDynamicStates(@Nullable @NativeType("VkDynamicState const *") IntBuffer value) { VkPipelineDynamicStateCreateInfo.npDynamicStates(address(), value); return this; }

    }

}