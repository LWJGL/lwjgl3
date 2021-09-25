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
 * Describe the power state of a display.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code powerState} <b>must</b> be a valid {@code VkDisplayPowerStateEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDisplayControl#vkDisplayPowerControlEXT DisplayPowerControlEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayPowerInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDisplayPowerStateEXT {@link #powerState};
 * }</code></pre>
 */
public class VkDisplayPowerInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        POWERSTATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        POWERSTATE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDisplayPowerInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPowerInfoEXT(ByteBuffer container) {
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
    /** a {@code VkDisplayPowerStateEXT} value specifying the new power state of the display. */
    @NativeType("VkDisplayPowerStateEXT")
    public int powerState() { return npowerState(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDisplayPowerInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT} value to the {@link #sType} field. */
    public VkDisplayPowerInfoEXT sType$Default() { return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDisplayPowerInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #powerState} field. */
    public VkDisplayPowerInfoEXT powerState(@NativeType("VkDisplayPowerStateEXT") int value) { npowerState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayPowerInfoEXT set(
        int sType,
        long pNext,
        int powerState
    ) {
        sType(sType);
        pNext(pNext);
        powerState(powerState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayPowerInfoEXT set(VkDisplayPowerInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPowerInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPowerInfoEXT malloc() {
        return wrap(VkDisplayPowerInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayPowerInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPowerInfoEXT calloc() {
        return wrap(VkDisplayPowerInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayPowerInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPowerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayPowerInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayPowerInfoEXT} instance for the specified memory address. */
    public static VkDisplayPowerInfoEXT create(long address) {
        return wrap(VkDisplayPowerInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPowerInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayPowerInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayPowerInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPowerInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPowerInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPowerInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPowerInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPowerInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPowerInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPowerInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPowerInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPowerInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayPowerInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPowerInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDisplayPowerInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayPowerInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPowerInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDisplayPowerInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPowerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPowerInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDisplayPowerInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayPowerInfoEXT.PNEXT); }
    /** Unsafe version of {@link #powerState}. */
    public static int npowerState(long struct) { return UNSAFE.getInt(null, struct + VkDisplayPowerInfoEXT.POWERSTATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayPowerInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayPowerInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #powerState(int) powerState}. */
    public static void npowerState(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayPowerInfoEXT.POWERSTATE, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayPowerInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPowerInfoEXT, Buffer> implements NativeResource {

        private static final VkDisplayPowerInfoEXT ELEMENT_FACTORY = VkDisplayPowerInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDisplayPowerInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPowerInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayPowerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplayPowerInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayPowerInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDisplayPowerInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplayPowerInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDisplayPowerInfoEXT#powerState} field. */
        @NativeType("VkDisplayPowerStateEXT")
        public int powerState() { return VkDisplayPowerInfoEXT.npowerState(address()); }

        /** Sets the specified value to the {@link VkDisplayPowerInfoEXT#sType} field. */
        public VkDisplayPowerInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayPowerInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT} value to the {@link VkDisplayPowerInfoEXT#sType} field. */
        public VkDisplayPowerInfoEXT.Buffer sType$Default() { return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT); }
        /** Sets the specified value to the {@link VkDisplayPowerInfoEXT#pNext} field. */
        public VkDisplayPowerInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDisplayPowerInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDisplayPowerInfoEXT#powerState} field. */
        public VkDisplayPowerInfoEXT.Buffer powerState(@NativeType("VkDisplayPowerStateEXT") int value) { VkDisplayPowerInfoEXT.npowerState(address(), value); return this; }

    }

}