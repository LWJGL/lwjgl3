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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code failOp} &ndash; a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test.</li>
 * <li>{@code passOp} &ndash; a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests.</li>
 * <li>{@code depthFailOp} &ndash; a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test.</li>
 * <li>{@code compareOp} &ndash; a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.</li>
 * <li>{@code compareMask} &ndash; selects the bits of the unsigned integer stencil values participating in the stencil test.</li>
 * <li>{@code writeMask} &ndash; selects the bits of the unsigned integer stencil values updated by the stencil test in the stencil framebuffer attachment.</li>
 * <li>{@code reference} &ndash; an integer reference value that is used in the unsigned stencil comparison.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkStencilOpState {
 *     VkStencilOp failOp;
 *     VkStencilOp passOp;
 *     VkStencilOp depthFailOp;
 *     VkCompareOp compareOp;
 *     uint32_t compareMask;
 *     uint32_t writeMask;
 *     uint32_t reference;
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

    /** Returns the value of the {@code failOp} field. */
    @NativeType("VkStencilOp")
    public int failOp() { return nfailOp(address()); }
    /** Returns the value of the {@code passOp} field. */
    @NativeType("VkStencilOp")
    public int passOp() { return npassOp(address()); }
    /** Returns the value of the {@code depthFailOp} field. */
    @NativeType("VkStencilOp")
    public int depthFailOp() { return ndepthFailOp(address()); }
    /** Returns the value of the {@code compareOp} field. */
    @NativeType("VkCompareOp")
    public int compareOp() { return ncompareOp(address()); }
    /** Returns the value of the {@code compareMask} field. */
    @NativeType("uint32_t")
    public int compareMask() { return ncompareMask(address()); }
    /** Returns the value of the {@code writeMask} field. */
    @NativeType("uint32_t")
    public int writeMask() { return nwriteMask(address()); }
    /** Returns the value of the {@code reference} field. */
    @NativeType("uint32_t")
    public int reference() { return nreference(address()); }

    /** Sets the specified value to the {@code failOp} field. */
    public VkStencilOpState failOp(@NativeType("VkStencilOp") int value) { nfailOp(address(), value); return this; }
    /** Sets the specified value to the {@code passOp} field. */
    public VkStencilOpState passOp(@NativeType("VkStencilOp") int value) { npassOp(address(), value); return this; }
    /** Sets the specified value to the {@code depthFailOp} field. */
    public VkStencilOpState depthFailOp(@NativeType("VkStencilOp") int value) { ndepthFailOp(address(), value); return this; }
    /** Sets the specified value to the {@code compareOp} field. */
    public VkStencilOpState compareOp(@NativeType("VkCompareOp") int value) { ncompareOp(address(), value); return this; }
    /** Sets the specified value to the {@code compareMask} field. */
    public VkStencilOpState compareMask(@NativeType("uint32_t") int value) { ncompareMask(address(), value); return this; }
    /** Sets the specified value to the {@code writeMask} field. */
    public VkStencilOpState writeMask(@NativeType("uint32_t") int value) { nwriteMask(address(), value); return this; }
    /** Sets the specified value to the {@code reference} field. */
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

    /** Returns a new {@code VkStencilOpState} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkStencilOpState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkStencilOpState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkStencilOpState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkStencilOpState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStencilOpState mallocStack(MemoryStack stack) {
        return wrap(VkStencilOpState.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkStencilOpState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStencilOpState callocStack(MemoryStack stack) {
        return wrap(VkStencilOpState.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStencilOpState.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** Returns the value of the {@code failOp} field. */
        @NativeType("VkStencilOp")
        public int failOp() { return VkStencilOpState.nfailOp(address()); }
        /** Returns the value of the {@code passOp} field. */
        @NativeType("VkStencilOp")
        public int passOp() { return VkStencilOpState.npassOp(address()); }
        /** Returns the value of the {@code depthFailOp} field. */
        @NativeType("VkStencilOp")
        public int depthFailOp() { return VkStencilOpState.ndepthFailOp(address()); }
        /** Returns the value of the {@code compareOp} field. */
        @NativeType("VkCompareOp")
        public int compareOp() { return VkStencilOpState.ncompareOp(address()); }
        /** Returns the value of the {@code compareMask} field. */
        @NativeType("uint32_t")
        public int compareMask() { return VkStencilOpState.ncompareMask(address()); }
        /** Returns the value of the {@code writeMask} field. */
        @NativeType("uint32_t")
        public int writeMask() { return VkStencilOpState.nwriteMask(address()); }
        /** Returns the value of the {@code reference} field. */
        @NativeType("uint32_t")
        public int reference() { return VkStencilOpState.nreference(address()); }

        /** Sets the specified value to the {@code failOp} field. */
        public VkStencilOpState.Buffer failOp(@NativeType("VkStencilOp") int value) { VkStencilOpState.nfailOp(address(), value); return this; }
        /** Sets the specified value to the {@code passOp} field. */
        public VkStencilOpState.Buffer passOp(@NativeType("VkStencilOp") int value) { VkStencilOpState.npassOp(address(), value); return this; }
        /** Sets the specified value to the {@code depthFailOp} field. */
        public VkStencilOpState.Buffer depthFailOp(@NativeType("VkStencilOp") int value) { VkStencilOpState.ndepthFailOp(address(), value); return this; }
        /** Sets the specified value to the {@code compareOp} field. */
        public VkStencilOpState.Buffer compareOp(@NativeType("VkCompareOp") int value) { VkStencilOpState.ncompareOp(address(), value); return this; }
        /** Sets the specified value to the {@code compareMask} field. */
        public VkStencilOpState.Buffer compareMask(@NativeType("uint32_t") int value) { VkStencilOpState.ncompareMask(address(), value); return this; }
        /** Sets the specified value to the {@code writeMask} field. */
        public VkStencilOpState.Buffer writeMask(@NativeType("uint32_t") int value) { VkStencilOpState.nwriteMask(address(), value); return this; }
        /** Sets the specified value to the {@code reference} field. */
        public VkStencilOpState.Buffer reference(@NativeType("uint32_t") int value) { VkStencilOpState.nreference(address(), value); return this; }

    }

}