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
 * Structure specifying stencil operation state.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code failOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
 * <li>{@code passOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
 * <li>{@code depthFailOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
 * <li>{@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineDepthStencilStateCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkStencilOpState {
 *     VkStencilOp {@link #failOp};
 *     VkStencilOp {@link #passOp};
 *     VkStencilOp {@link #depthFailOp};
 *     VkCompareOp {@link #compareOp};
 *     uint32_t {@link #compareMask};
 *     uint32_t {@link #writeMask};
 *     uint32_t {@link #reference};
 * }</code></pre>
 */
public class VkStencilOpState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FAILOP,
        PASSOP,
        DEPTHFAILOP,
        COMPAREOP,
        COMPAREMASK,
        WRITEMASK,
        REFERENCE;

    static {
        Layout layout = __struct(
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

        FAILOP = layout.offsetof(0);
        PASSOP = layout.offsetof(1);
        DEPTHFAILOP = layout.offsetof(2);
        COMPAREOP = layout.offsetof(3);
        COMPAREMASK = layout.offsetof(4);
        WRITEMASK = layout.offsetof(5);
        REFERENCE = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkStencilOpState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkStencilOpState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test. */
    @NativeType("VkStencilOp")
    public int failOp() { return nfailOp(address()); }
    /** a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests. */
    @NativeType("VkStencilOp")
    public int passOp() { return npassOp(address()); }
    /** a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test. */
    @NativeType("VkStencilOp")
    public int depthFailOp() { return ndepthFailOp(address()); }
    /** a {@code VkCompareOp} value specifying the comparison operator used in the stencil test. */
    @NativeType("VkCompareOp")
    public int compareOp() { return ncompareOp(address()); }
    /** selects the bits of the unsigned integer stencil values participating in the stencil test. */
    @NativeType("uint32_t")
    public int compareMask() { return ncompareMask(address()); }
    /** selects the bits of the unsigned integer stencil values updated by the stencil test in the stencil framebuffer attachment. */
    @NativeType("uint32_t")
    public int writeMask() { return nwriteMask(address()); }
    /** an integer reference value that is used in the unsigned stencil comparison. */
    @NativeType("uint32_t")
    public int reference() { return nreference(address()); }

    /** Sets the specified value to the {@link #failOp} field. */
    public VkStencilOpState failOp(@NativeType("VkStencilOp") int value) { nfailOp(address(), value); return this; }
    /** Sets the specified value to the {@link #passOp} field. */
    public VkStencilOpState passOp(@NativeType("VkStencilOp") int value) { npassOp(address(), value); return this; }
    /** Sets the specified value to the {@link #depthFailOp} field. */
    public VkStencilOpState depthFailOp(@NativeType("VkStencilOp") int value) { ndepthFailOp(address(), value); return this; }
    /** Sets the specified value to the {@link #compareOp} field. */
    public VkStencilOpState compareOp(@NativeType("VkCompareOp") int value) { ncompareOp(address(), value); return this; }
    /** Sets the specified value to the {@link #compareMask} field. */
    public VkStencilOpState compareMask(@NativeType("uint32_t") int value) { ncompareMask(address(), value); return this; }
    /** Sets the specified value to the {@link #writeMask} field. */
    public VkStencilOpState writeMask(@NativeType("uint32_t") int value) { nwriteMask(address(), value); return this; }
    /** Sets the specified value to the {@link #reference} field. */
    public VkStencilOpState reference(@NativeType("uint32_t") int value) { nreference(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkStencilOpState set(
        int failOp,
        int passOp,
        int depthFailOp,
        int compareOp,
        int compareMask,
        int writeMask,
        int reference
    ) {
        failOp(failOp);
        passOp(passOp);
        depthFailOp(depthFailOp);
        compareOp(compareOp);
        compareMask(compareMask);
        writeMask(writeMask);
        reference(reference);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkStencilOpState set(VkStencilOpState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkStencilOpState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkStencilOpState malloc() {
        return wrap(VkStencilOpState.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkStencilOpState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkStencilOpState calloc() {
        return wrap(VkStencilOpState.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkStencilOpState} instance allocated with {@link BufferUtils}. */
    public static VkStencilOpState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkStencilOpState.class, memAddress(container), container);
    }

    /** Returns a new {@code VkStencilOpState} instance for the specified memory address. */
    public static VkStencilOpState create(long address) {
        return wrap(VkStencilOpState.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkStencilOpState createSafe(long address) {
        return address == NULL ? null : wrap(VkStencilOpState.class, address);
    }

    /**
     * Returns a new {@link VkStencilOpState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkStencilOpState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStencilOpState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkStencilOpState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkStencilOpState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkStencilOpState mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkStencilOpState callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkStencilOpState mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkStencilOpState callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkStencilOpState.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkStencilOpState.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkStencilOpState.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkStencilOpState.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkStencilOpState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStencilOpState malloc(MemoryStack stack) {
        return wrap(VkStencilOpState.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkStencilOpState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStencilOpState calloc(MemoryStack stack) {
        return wrap(VkStencilOpState.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #failOp}. */
    public static int nfailOp(long struct) { return UNSAFE.getInt(null, struct + VkStencilOpState.FAILOP); }
    /** Unsafe version of {@link #passOp}. */
    public static int npassOp(long struct) { return UNSAFE.getInt(null, struct + VkStencilOpState.PASSOP); }
    /** Unsafe version of {@link #depthFailOp}. */
    public static int ndepthFailOp(long struct) { return UNSAFE.getInt(null, struct + VkStencilOpState.DEPTHFAILOP); }
    /** Unsafe version of {@link #compareOp}. */
    public static int ncompareOp(long struct) { return UNSAFE.getInt(null, struct + VkStencilOpState.COMPAREOP); }
    /** Unsafe version of {@link #compareMask}. */
    public static int ncompareMask(long struct) { return UNSAFE.getInt(null, struct + VkStencilOpState.COMPAREMASK); }
    /** Unsafe version of {@link #writeMask}. */
    public static int nwriteMask(long struct) { return UNSAFE.getInt(null, struct + VkStencilOpState.WRITEMASK); }
    /** Unsafe version of {@link #reference}. */
    public static int nreference(long struct) { return UNSAFE.getInt(null, struct + VkStencilOpState.REFERENCE); }

    /** Unsafe version of {@link #failOp(int) failOp}. */
    public static void nfailOp(long struct, int value) { UNSAFE.putInt(null, struct + VkStencilOpState.FAILOP, value); }
    /** Unsafe version of {@link #passOp(int) passOp}. */
    public static void npassOp(long struct, int value) { UNSAFE.putInt(null, struct + VkStencilOpState.PASSOP, value); }
    /** Unsafe version of {@link #depthFailOp(int) depthFailOp}. */
    public static void ndepthFailOp(long struct, int value) { UNSAFE.putInt(null, struct + VkStencilOpState.DEPTHFAILOP, value); }
    /** Unsafe version of {@link #compareOp(int) compareOp}. */
    public static void ncompareOp(long struct, int value) { UNSAFE.putInt(null, struct + VkStencilOpState.COMPAREOP, value); }
    /** Unsafe version of {@link #compareMask(int) compareMask}. */
    public static void ncompareMask(long struct, int value) { UNSAFE.putInt(null, struct + VkStencilOpState.COMPAREMASK, value); }
    /** Unsafe version of {@link #writeMask(int) writeMask}. */
    public static void nwriteMask(long struct, int value) { UNSAFE.putInt(null, struct + VkStencilOpState.WRITEMASK, value); }
    /** Unsafe version of {@link #reference(int) reference}. */
    public static void nreference(long struct, int value) { UNSAFE.putInt(null, struct + VkStencilOpState.REFERENCE, value); }

    // -----------------------------------

    /** An array of {@link VkStencilOpState} structs. */
    public static class Buffer extends StructBuffer<VkStencilOpState, Buffer> implements NativeResource {

        private static final VkStencilOpState ELEMENT_FACTORY = VkStencilOpState.create(-1L);

        /**
         * Creates a new {@code VkStencilOpState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkStencilOpState#SIZEOF}, and its mark will be undefined.
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
        protected VkStencilOpState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkStencilOpState#failOp} field. */
        @NativeType("VkStencilOp")
        public int failOp() { return VkStencilOpState.nfailOp(address()); }
        /** @return the value of the {@link VkStencilOpState#passOp} field. */
        @NativeType("VkStencilOp")
        public int passOp() { return VkStencilOpState.npassOp(address()); }
        /** @return the value of the {@link VkStencilOpState#depthFailOp} field. */
        @NativeType("VkStencilOp")
        public int depthFailOp() { return VkStencilOpState.ndepthFailOp(address()); }
        /** @return the value of the {@link VkStencilOpState#compareOp} field. */
        @NativeType("VkCompareOp")
        public int compareOp() { return VkStencilOpState.ncompareOp(address()); }
        /** @return the value of the {@link VkStencilOpState#compareMask} field. */
        @NativeType("uint32_t")
        public int compareMask() { return VkStencilOpState.ncompareMask(address()); }
        /** @return the value of the {@link VkStencilOpState#writeMask} field. */
        @NativeType("uint32_t")
        public int writeMask() { return VkStencilOpState.nwriteMask(address()); }
        /** @return the value of the {@link VkStencilOpState#reference} field. */
        @NativeType("uint32_t")
        public int reference() { return VkStencilOpState.nreference(address()); }

        /** Sets the specified value to the {@link VkStencilOpState#failOp} field. */
        public VkStencilOpState.Buffer failOp(@NativeType("VkStencilOp") int value) { VkStencilOpState.nfailOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkStencilOpState#passOp} field. */
        public VkStencilOpState.Buffer passOp(@NativeType("VkStencilOp") int value) { VkStencilOpState.npassOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkStencilOpState#depthFailOp} field. */
        public VkStencilOpState.Buffer depthFailOp(@NativeType("VkStencilOp") int value) { VkStencilOpState.ndepthFailOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkStencilOpState#compareOp} field. */
        public VkStencilOpState.Buffer compareOp(@NativeType("VkCompareOp") int value) { VkStencilOpState.ncompareOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkStencilOpState#compareMask} field. */
        public VkStencilOpState.Buffer compareMask(@NativeType("uint32_t") int value) { VkStencilOpState.ncompareMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkStencilOpState#writeMask} field. */
        public VkStencilOpState.Buffer writeMask(@NativeType("uint32_t") int value) { VkStencilOpState.nwriteMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkStencilOpState#reference} field. */
        public VkStencilOpState.Buffer reference(@NativeType("uint32_t") int value) { VkStencilOpState.nreference(address(), value); return this; }

    }

}