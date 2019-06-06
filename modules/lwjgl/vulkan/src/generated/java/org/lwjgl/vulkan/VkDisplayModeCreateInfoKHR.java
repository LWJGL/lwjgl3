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
 * Structure specifying parameters of a newly created display mode object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code parameters} <b>must</b> be a valid {@link VkDisplayModeParametersKHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayModeParametersKHR}, {@link KHRDisplay#vkCreateDisplayModeKHR CreateDisplayModeKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use, and <b>must</b> be zero.</li>
 * <li>{@code parameters} &ndash; a {@link VkDisplayModeParametersKHR} structure describing the display parameters to use in creating the new mode. If the parameters are not compatible with the specified display, the implementation <b>must</b> return {@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayModeCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDisplayModeCreateFlagsKHR flags;
 *     {@link VkDisplayModeParametersKHR VkDisplayModeParametersKHR} parameters;
 * }</code></pre>
 */
public class VkDisplayModeCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PARAMETERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkDisplayModeParametersKHR.SIZEOF, VkDisplayModeParametersKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PARAMETERS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDisplayModeCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayModeCreateInfoKHR(ByteBuffer container) {
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
    @NativeType("VkDisplayModeCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
    public VkDisplayModeParametersKHR parameters() { return nparameters(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplayModeCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDisplayModeCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDisplayModeCreateInfoKHR flags(@NativeType("VkDisplayModeCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkDisplayModeParametersKHR} to the {@code parameters} field. */
    public VkDisplayModeCreateInfoKHR parameters(VkDisplayModeParametersKHR value) { nparameters(address(), value); return this; }
    /** Passes the {@code parameters} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDisplayModeCreateInfoKHR parameters(java.util.function.Consumer<VkDisplayModeParametersKHR> consumer) { consumer.accept(parameters()); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayModeCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        VkDisplayModeParametersKHR parameters
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        parameters(parameters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayModeCreateInfoKHR set(VkDisplayModeCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayModeCreateInfoKHR malloc() {
        return wrap(VkDisplayModeCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayModeCreateInfoKHR calloc() {
        return wrap(VkDisplayModeCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayModeCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayModeCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance for the specified memory address. */
    public static VkDisplayModeCreateInfoKHR create(long address) {
        return wrap(VkDisplayModeCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayModeCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayModeCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayModeCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayModeCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDisplayModeCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDisplayModeCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeCreateInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkDisplayModeCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeCreateInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkDisplayModeCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDisplayModeCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayModeCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDisplayModeCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #parameters}. */
    public static VkDisplayModeParametersKHR nparameters(long struct) { return VkDisplayModeParametersKHR.create(struct + VkDisplayModeCreateInfoKHR.PARAMETERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayModeCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayModeCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayModeCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #parameters(VkDisplayModeParametersKHR) parameters}. */
    public static void nparameters(long struct, VkDisplayModeParametersKHR value) { memCopy(value.address(), struct + VkDisplayModeCreateInfoKHR.PARAMETERS, VkDisplayModeParametersKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkDisplayModeCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayModeCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkDisplayModeCreateInfoKHR ELEMENT_FACTORY = VkDisplayModeCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayModeCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayModeCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayModeCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayModeCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplayModeCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkDisplayModeCreateFlagsKHR")
        public int flags() { return VkDisplayModeCreateInfoKHR.nflags(address()); }
        /** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
        public VkDisplayModeParametersKHR parameters() { return VkDisplayModeCreateInfoKHR.nparameters(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplayModeCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayModeCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplayModeCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDisplayModeCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDisplayModeCreateInfoKHR.Buffer flags(@NativeType("VkDisplayModeCreateFlagsKHR") int value) { VkDisplayModeCreateInfoKHR.nflags(address(), value); return this; }
        /** Copies the specified {@link VkDisplayModeParametersKHR} to the {@code parameters} field. */
        public VkDisplayModeCreateInfoKHR.Buffer parameters(VkDisplayModeParametersKHR value) { VkDisplayModeCreateInfoKHR.nparameters(address(), value); return this; }
        /** Passes the {@code parameters} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDisplayModeCreateInfoKHR.Buffer parameters(java.util.function.Consumer<VkDisplayModeParametersKHR> consumer) { consumer.accept(parameters()); return this; }

    }

}