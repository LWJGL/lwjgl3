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
 * Structure specifying the input parameters of a calibrated timestamp query.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code timeDomain} <b>must</b> be one of the {@code VkTimeDomainEXT} values returned by {@link EXTCalibratedTimestamps#vkGetPhysicalDeviceCalibrateableTimeDomainsEXT GetPhysicalDeviceCalibrateableTimeDomainsEXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTCalibratedTimestamps#VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code timeDomain} <b>must</b> be a valid {@code VkTimeDomainEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTCalibratedTimestamps#vkGetCalibratedTimestampsEXT GetCalibratedTimestampsEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code timeDomain} &ndash; a {@code VkTimeDomainEXT} value specifying the time domain from which the calibrated timestamp value should be returned.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCalibratedTimestampInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTimeDomainEXT timeDomain;
 * }</code></pre>
 */
public class VkCalibratedTimestampInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TIMEDOMAIN;

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
        TIMEDOMAIN = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkCalibratedTimestampInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCalibratedTimestampInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code timeDomain} field. */
    @NativeType("VkTimeDomainEXT")
    public int timeDomain() { return ntimeDomain(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCalibratedTimestampInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCalibratedTimestampInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code timeDomain} field. */
    public VkCalibratedTimestampInfoEXT timeDomain(@NativeType("VkTimeDomainEXT") int value) { ntimeDomain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCalibratedTimestampInfoEXT set(
        int sType,
        long pNext,
        int timeDomain
    ) {
        sType(sType);
        pNext(pNext);
        timeDomain(timeDomain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCalibratedTimestampInfoEXT set(VkCalibratedTimestampInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCalibratedTimestampInfoEXT malloc() {
        return wrap(VkCalibratedTimestampInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCalibratedTimestampInfoEXT calloc() {
        return wrap(VkCalibratedTimestampInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCalibratedTimestampInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCalibratedTimestampInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance for the specified memory address. */
    public static VkCalibratedTimestampInfoEXT create(long address) {
        return wrap(VkCalibratedTimestampInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCalibratedTimestampInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkCalibratedTimestampInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCalibratedTimestampInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCalibratedTimestampInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkCalibratedTimestampInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkCalibratedTimestampInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCalibratedTimestampInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkCalibratedTimestampInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCalibratedTimestampInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkCalibratedTimestampInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCalibratedTimestampInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCalibratedTimestampInfoEXT.PNEXT); }
    /** Unsafe version of {@link #timeDomain}. */
    public static int ntimeDomain(long struct) { return UNSAFE.getInt(null, struct + VkCalibratedTimestampInfoEXT.TIMEDOMAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCalibratedTimestampInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCalibratedTimestampInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #timeDomain(int) timeDomain}. */
    public static void ntimeDomain(long struct, int value) { UNSAFE.putInt(null, struct + VkCalibratedTimestampInfoEXT.TIMEDOMAIN, value); }

    // -----------------------------------

    /** An array of {@link VkCalibratedTimestampInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkCalibratedTimestampInfoEXT, Buffer> implements NativeResource {

        private static final VkCalibratedTimestampInfoEXT ELEMENT_FACTORY = VkCalibratedTimestampInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCalibratedTimestampInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCalibratedTimestampInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkCalibratedTimestampInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCalibratedTimestampInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCalibratedTimestampInfoEXT.npNext(address()); }
        /** Returns the value of the {@code timeDomain} field. */
        @NativeType("VkTimeDomainEXT")
        public int timeDomain() { return VkCalibratedTimestampInfoEXT.ntimeDomain(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCalibratedTimestampInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCalibratedTimestampInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCalibratedTimestampInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCalibratedTimestampInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code timeDomain} field. */
        public VkCalibratedTimestampInfoEXT.Buffer timeDomain(@NativeType("VkTimeDomainEXT") int value) { VkCalibratedTimestampInfoEXT.ntimeDomain(address(), value); return this; }

    }

}