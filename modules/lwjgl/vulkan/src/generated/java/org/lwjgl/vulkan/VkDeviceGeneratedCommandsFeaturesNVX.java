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
 * Structure specifying physical device support.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVXDeviceGeneratedCommands#vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX GetPhysicalDeviceGeneratedCommandsPropertiesNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code computeBindingPointSupport} &ndash; specifies whether the {@code VkObjectTableNVX} supports entries with {@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX} bit set and {@code VkIndirectCommandsLayoutNVX} supports {@link VK10#VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDeviceGeneratedCommandsFeaturesNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 computeBindingPointSupport;
 * }</pre></code>
 */
public class VkDeviceGeneratedCommandsFeaturesNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPUTEBINDINGPOINTSUPPORT;

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
        COMPUTEBINDINGPOINTSUPPORT = layout.offsetof(2);
    }

    VkDeviceGeneratedCommandsFeaturesNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDeviceGeneratedCommandsFeaturesNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGeneratedCommandsFeaturesNVX(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code computeBindingPointSupport} field. */
    @NativeType("VkBool32")
    public boolean computeBindingPointSupport() { return ncomputeBindingPointSupport(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGeneratedCommandsFeaturesNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGeneratedCommandsFeaturesNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code computeBindingPointSupport} field. */
    public VkDeviceGeneratedCommandsFeaturesNVX computeBindingPointSupport(@NativeType("VkBool32") boolean value) { ncomputeBindingPointSupport(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGeneratedCommandsFeaturesNVX set(
        int sType,
        long pNext,
        boolean computeBindingPointSupport
    ) {
        sType(sType);
        pNext(pNext);
        computeBindingPointSupport(computeBindingPointSupport);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGeneratedCommandsFeaturesNVX set(VkDeviceGeneratedCommandsFeaturesNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGeneratedCommandsFeaturesNVX malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGeneratedCommandsFeaturesNVX calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGeneratedCommandsFeaturesNVX create() {
        return new VkDeviceGeneratedCommandsFeaturesNVX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX} instance for the specified memory address. */
    public static VkDeviceGeneratedCommandsFeaturesNVX create(long address) {
        return new VkDeviceGeneratedCommandsFeaturesNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGeneratedCommandsFeaturesNVX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDeviceGeneratedCommandsFeaturesNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGeneratedCommandsFeaturesNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGeneratedCommandsFeaturesNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGeneratedCommandsFeaturesNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGeneratedCommandsFeaturesNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGeneratedCommandsFeaturesNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGeneratedCommandsFeaturesNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGeneratedCommandsFeaturesNVX.PNEXT); }
    /** Unsafe version of {@link #computeBindingPointSupport}. */
    public static int ncomputeBindingPointSupport(long struct) { return memGetInt(struct + VkDeviceGeneratedCommandsFeaturesNVX.COMPUTEBINDINGPOINTSUPPORT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGeneratedCommandsFeaturesNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGeneratedCommandsFeaturesNVX.PNEXT, value); }
    /** Unsafe version of {@link #computeBindingPointSupport(boolean) computeBindingPointSupport}. */
    public static void ncomputeBindingPointSupport(long struct, int value) { memPutInt(struct + VkDeviceGeneratedCommandsFeaturesNVX.COMPUTEBINDINGPOINTSUPPORT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceGeneratedCommandsFeaturesNVX} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGeneratedCommandsFeaturesNVX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDeviceGeneratedCommandsFeaturesNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGeneratedCommandsFeaturesNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGeneratedCommandsFeaturesNVX newInstance(long address) {
            return new VkDeviceGeneratedCommandsFeaturesNVX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGeneratedCommandsFeaturesNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGeneratedCommandsFeaturesNVX.npNext(address()); }
        /** Returns the value of the {@code computeBindingPointSupport} field. */
        @NativeType("VkBool32")
        public boolean computeBindingPointSupport() { return VkDeviceGeneratedCommandsFeaturesNVX.ncomputeBindingPointSupport(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGeneratedCommandsFeaturesNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGeneratedCommandsFeaturesNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGeneratedCommandsFeaturesNVX.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGeneratedCommandsFeaturesNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code computeBindingPointSupport} field. */
        public VkDeviceGeneratedCommandsFeaturesNVX.Buffer computeBindingPointSupport(@NativeType("VkBool32") boolean value) { VkDeviceGeneratedCommandsFeaturesNVX.ncomputeBindingPointSupport(address(), value ? 1 : 0); return this; }

    }

}