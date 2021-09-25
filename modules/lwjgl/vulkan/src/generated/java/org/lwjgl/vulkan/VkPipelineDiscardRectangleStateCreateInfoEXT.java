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
 * Structure specifying discard rectangle.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT} dynamic state is enabled for a pipeline, the {@code pDiscardRectangles} member is ignored.</p>
 * 
 * <p>When this structure is included in the {@code pNext} chain of {@link VkGraphicsPipelineCreateInfo}, it defines parameters of the discard rectangle test. If this structure is not included in the {@code pNext} chain, it is equivalent to specifying this structure with a {@code discardRectangleCount} of 0.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code discardRectangleCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT}{@code ::maxDiscardRectangles}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDiscardRectangles#VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code discardRectangleMode} <b>must</b> be a valid {@code VkDiscardRectangleModeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineDiscardRectangleStateCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineDiscardRectangleStateCreateFlagsEXT {@link #flags};
 *     VkDiscardRectangleModeEXT {@link #discardRectangleMode};
 *     uint32_t {@link #discardRectangleCount};
 *     {@link VkRect2D VkRect2D} const * {@link #pDiscardRectangles};
 * }</code></pre>
 */
public class VkPipelineDiscardRectangleStateCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DISCARDRECTANGLEMODE,
        DISCARDRECTANGLECOUNT,
        PDISCARDRECTANGLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DISCARDRECTANGLEMODE = layout.offsetof(3);
        DISCARDRECTANGLECOUNT = layout.offsetof(4);
        PDISCARDRECTANGLES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineDiscardRectangleStateCreateInfoEXT(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a {@code VkDiscardRectangleModeEXT} value determining whether the discard rectangle test is inclusive or exclusive. */
    @NativeType("VkDiscardRectangleModeEXT")
    public int discardRectangleMode() { return ndiscardRectangleMode(address()); }
    /** the number of discard rectangles to use. */
    @NativeType("uint32_t")
    public int discardRectangleCount() { return ndiscardRectangleCount(address()); }
    /** a pointer to an array of {@link VkRect2D} structures defining discard rectangles. */
    @Nullable
    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pDiscardRectangles() { return npDiscardRectangles(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDiscardRectangles#VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT sType$Default() { return sType(EXTDiscardRectangles.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT flags(@NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #discardRectangleMode} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleMode(@NativeType("VkDiscardRectangleModeEXT") int value) { ndiscardRectangleMode(address(), value); return this; }
    /** Sets the specified value to the {@link #discardRectangleCount} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCount(@NativeType("uint32_t") int value) { ndiscardRectangleCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@link #pDiscardRectangles} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectangles(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { npDiscardRectangles(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int discardRectangleMode,
        int discardRectangleCount,
        @Nullable VkRect2D.Buffer pDiscardRectangles
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        discardRectangleMode(discardRectangleMode);
        discardRectangleCount(discardRectangleCount);
        pDiscardRectangles(pDiscardRectangles);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineDiscardRectangleStateCreateInfoEXT set(VkPipelineDiscardRectangleStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT malloc() {
        return wrap(VkPipelineDiscardRectangleStateCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT calloc() {
        return wrap(VkPipelineDiscardRectangleStateCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineDiscardRectangleStateCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT create(long address) {
        return wrap(VkPipelineDiscardRectangleStateCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineDiscardRectangleStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineDiscardRectangleStateCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineDiscardRectangleStateCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineDiscardRectangleStateCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineDiscardRectangleStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineDiscardRectangleStateCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #discardRectangleMode}. */
    public static int ndiscardRectangleMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLEMODE); }
    /** Unsafe version of {@link #discardRectangleCount}. */
    public static int ndiscardRectangleCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLECOUNT); }
    /** Unsafe version of {@link #pDiscardRectangles}. */
    @Nullable public static VkRect2D.Buffer npDiscardRectangles(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PDISCARDRECTANGLES), ndiscardRectangleCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineDiscardRectangleStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineDiscardRectangleStateCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #discardRectangleMode(int) discardRectangleMode}. */
    public static void ndiscardRectangleMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLEMODE, value); }
    /** Sets the specified value to the {@code discardRectangleCount} field of the specified {@code struct}. */
    public static void ndiscardRectangleCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLECOUNT, value); }
    /** Unsafe version of {@link #pDiscardRectangles(VkRect2D.Buffer) pDiscardRectangles}. */
    public static void npDiscardRectangles(long struct, @Nullable VkRect2D.Buffer value) { memPutAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PDISCARDRECTANGLES, memAddressSafe(value)); if (value != null) { ndiscardRectangleCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineDiscardRectangleStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineDiscardRectangleStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineDiscardRectangleStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineDiscardRectangleStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineDiscardRectangleStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineDiscardRectangleStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#flags} field. */
        @NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
        public int flags() { return VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#discardRectangleMode} field. */
        @NativeType("VkDiscardRectangleModeEXT")
        public int discardRectangleMode() { return VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(address()); }
        /** @return the value of the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#discardRectangleCount} field. */
        @NativeType("uint32_t")
        public int discardRectangleCount() { return VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(address()); }
        /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#pDiscardRectangles} field. */
        @Nullable
        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pDiscardRectangles() { return VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(address()); }

        /** Sets the specified value to the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#sType} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDiscardRectangles#VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT} value to the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#sType} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTDiscardRectangles.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#pNext} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#flags} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer flags(@NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#discardRectangleMode} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer discardRectangleMode(@NativeType("VkDiscardRectangleModeEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#discardRectangleCount} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer discardRectangleCount(@NativeType("uint32_t") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@link VkPipelineDiscardRectangleStateCreateInfoEXT#pDiscardRectangles} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer pDiscardRectangles(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(address(), value); return this; }

    }

}