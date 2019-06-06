/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the theme used to draw nodes.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code nodeSelectedColor} &ndash; inner color of selected node (and downarrow)</li>
 * <li>{@code wiresColor} &ndash; outline of wires</li>
 * <li>{@code textSelectedColor} &ndash; color of text label when active</li>
 * <li>{@code activeNodeColor} &ndash; inner color of active node (and dragged wire)</li>
 * <li>{@code wireSelectColor} &ndash; color of selected wire</li>
 * <li>{@code nodeBackdropColor} &ndash; color of background of node</li>
 * <li>{@code noodleCurving} &ndash; how much a noodle curves (0 to 10)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct BNDnodeTheme {
 *     {@link NVGColor NVGcolor} nodeSelectedColor;
 *     {@link NVGColor NVGcolor} wiresColor;
 *     {@link NVGColor NVGcolor} textSelectedColor;
 *     {@link NVGColor NVGcolor} activeNodeColor;
 *     {@link NVGColor NVGcolor} wireSelectColor;
 *     {@link NVGColor NVGcolor} nodeBackdropColor;
 *     int noodleCurving;
 * }</code></pre>
 */
public class BNDnodeTheme extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NODESELECTEDCOLOR,
        WIRESCOLOR,
        TEXTSELECTEDCOLOR,
        ACTIVENODECOLOR,
        WIRESELECTCOLOR,
        NODEBACKDROPCOLOR,
        NOODLECURVING;

    static {
        Layout layout = __struct(
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NODESELECTEDCOLOR = layout.offsetof(0);
        WIRESCOLOR = layout.offsetof(1);
        TEXTSELECTEDCOLOR = layout.offsetof(2);
        ACTIVENODECOLOR = layout.offsetof(3);
        WIRESELECTCOLOR = layout.offsetof(4);
        NODEBACKDROPCOLOR = layout.offsetof(5);
        NOODLECURVING = layout.offsetof(6);
    }

    /**
     * Creates a {@code BNDnodeTheme} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BNDnodeTheme(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NVGColor} view of the {@code nodeSelectedColor} field. */
    @NativeType("NVGcolor")
    public NVGColor nodeSelectedColor() { return nnodeSelectedColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code wiresColor} field. */
    @NativeType("NVGcolor")
    public NVGColor wiresColor() { return nwiresColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code textSelectedColor} field. */
    @NativeType("NVGcolor")
    public NVGColor textSelectedColor() { return ntextSelectedColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code activeNodeColor} field. */
    @NativeType("NVGcolor")
    public NVGColor activeNodeColor() { return nactiveNodeColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code wireSelectColor} field. */
    @NativeType("NVGcolor")
    public NVGColor wireSelectColor() { return nwireSelectColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code nodeBackdropColor} field. */
    @NativeType("NVGcolor")
    public NVGColor nodeBackdropColor() { return nnodeBackdropColor(address()); }
    /** Returns the value of the {@code noodleCurving} field. */
    public int noodleCurving() { return nnoodleCurving(address()); }

    /** Copies the specified {@link NVGColor} to the {@code nodeSelectedColor} field. */
    public BNDnodeTheme nodeSelectedColor(@NativeType("NVGcolor") NVGColor value) { nnodeSelectedColor(address(), value); return this; }
    /** Passes the {@code nodeSelectedColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDnodeTheme nodeSelectedColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(nodeSelectedColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code wiresColor} field. */
    public BNDnodeTheme wiresColor(@NativeType("NVGcolor") NVGColor value) { nwiresColor(address(), value); return this; }
    /** Passes the {@code wiresColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDnodeTheme wiresColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(wiresColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code textSelectedColor} field. */
    public BNDnodeTheme textSelectedColor(@NativeType("NVGcolor") NVGColor value) { ntextSelectedColor(address(), value); return this; }
    /** Passes the {@code textSelectedColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDnodeTheme textSelectedColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(textSelectedColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code activeNodeColor} field. */
    public BNDnodeTheme activeNodeColor(@NativeType("NVGcolor") NVGColor value) { nactiveNodeColor(address(), value); return this; }
    /** Passes the {@code activeNodeColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDnodeTheme activeNodeColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(activeNodeColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code wireSelectColor} field. */
    public BNDnodeTheme wireSelectColor(@NativeType("NVGcolor") NVGColor value) { nwireSelectColor(address(), value); return this; }
    /** Passes the {@code wireSelectColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDnodeTheme wireSelectColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(wireSelectColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code nodeBackdropColor} field. */
    public BNDnodeTheme nodeBackdropColor(@NativeType("NVGcolor") NVGColor value) { nnodeBackdropColor(address(), value); return this; }
    /** Passes the {@code nodeBackdropColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDnodeTheme nodeBackdropColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(nodeBackdropColor()); return this; }
    /** Sets the specified value to the {@code noodleCurving} field. */
    public BNDnodeTheme noodleCurving(int value) { nnoodleCurving(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BNDnodeTheme set(
        NVGColor nodeSelectedColor,
        NVGColor wiresColor,
        NVGColor textSelectedColor,
        NVGColor activeNodeColor,
        NVGColor wireSelectColor,
        NVGColor nodeBackdropColor,
        int noodleCurving
    ) {
        nodeSelectedColor(nodeSelectedColor);
        wiresColor(wiresColor);
        textSelectedColor(textSelectedColor);
        activeNodeColor(activeNodeColor);
        wireSelectColor(wireSelectColor);
        nodeBackdropColor(nodeBackdropColor);
        noodleCurving(noodleCurving);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BNDnodeTheme set(BNDnodeTheme src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BNDnodeTheme} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BNDnodeTheme malloc() {
        return wrap(BNDnodeTheme.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BNDnodeTheme} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BNDnodeTheme calloc() {
        return wrap(BNDnodeTheme.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BNDnodeTheme} instance allocated with {@link BufferUtils}. */
    public static BNDnodeTheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BNDnodeTheme.class, memAddress(container), container);
    }

    /** Returns a new {@code BNDnodeTheme} instance for the specified memory address. */
    public static BNDnodeTheme create(long address) {
        return wrap(BNDnodeTheme.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BNDnodeTheme createSafe(long address) {
        return address == NULL ? null : wrap(BNDnodeTheme.class, address);
    }

    /**
     * Returns a new {@link BNDnodeTheme.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BNDnodeTheme.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BNDnodeTheme.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BNDnodeTheme.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BNDnodeTheme.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BNDnodeTheme.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BNDnodeTheme.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BNDnodeTheme.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BNDnodeTheme.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code BNDnodeTheme} instance allocated on the thread-local {@link MemoryStack}. */
    public static BNDnodeTheme mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BNDnodeTheme} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BNDnodeTheme callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BNDnodeTheme} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BNDnodeTheme mallocStack(MemoryStack stack) {
        return wrap(BNDnodeTheme.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BNDnodeTheme} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BNDnodeTheme callocStack(MemoryStack stack) {
        return wrap(BNDnodeTheme.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BNDnodeTheme.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BNDnodeTheme.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BNDnodeTheme.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BNDnodeTheme.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BNDnodeTheme.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BNDnodeTheme.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BNDnodeTheme.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BNDnodeTheme.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nodeSelectedColor}. */
    public static NVGColor nnodeSelectedColor(long struct) { return NVGColor.create(struct + BNDnodeTheme.NODESELECTEDCOLOR); }
    /** Unsafe version of {@link #wiresColor}. */
    public static NVGColor nwiresColor(long struct) { return NVGColor.create(struct + BNDnodeTheme.WIRESCOLOR); }
    /** Unsafe version of {@link #textSelectedColor}. */
    public static NVGColor ntextSelectedColor(long struct) { return NVGColor.create(struct + BNDnodeTheme.TEXTSELECTEDCOLOR); }
    /** Unsafe version of {@link #activeNodeColor}. */
    public static NVGColor nactiveNodeColor(long struct) { return NVGColor.create(struct + BNDnodeTheme.ACTIVENODECOLOR); }
    /** Unsafe version of {@link #wireSelectColor}. */
    public static NVGColor nwireSelectColor(long struct) { return NVGColor.create(struct + BNDnodeTheme.WIRESELECTCOLOR); }
    /** Unsafe version of {@link #nodeBackdropColor}. */
    public static NVGColor nnodeBackdropColor(long struct) { return NVGColor.create(struct + BNDnodeTheme.NODEBACKDROPCOLOR); }
    /** Unsafe version of {@link #noodleCurving}. */
    public static int nnoodleCurving(long struct) { return UNSAFE.getInt(null, struct + BNDnodeTheme.NOODLECURVING); }

    /** Unsafe version of {@link #nodeSelectedColor(NVGColor) nodeSelectedColor}. */
    public static void nnodeSelectedColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDnodeTheme.NODESELECTEDCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #wiresColor(NVGColor) wiresColor}. */
    public static void nwiresColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDnodeTheme.WIRESCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #textSelectedColor(NVGColor) textSelectedColor}. */
    public static void ntextSelectedColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDnodeTheme.TEXTSELECTEDCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #activeNodeColor(NVGColor) activeNodeColor}. */
    public static void nactiveNodeColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDnodeTheme.ACTIVENODECOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #wireSelectColor(NVGColor) wireSelectColor}. */
    public static void nwireSelectColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDnodeTheme.WIRESELECTCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #nodeBackdropColor(NVGColor) nodeBackdropColor}. */
    public static void nnodeBackdropColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDnodeTheme.NODEBACKDROPCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #noodleCurving(int) noodleCurving}. */
    public static void nnoodleCurving(long struct, int value) { UNSAFE.putInt(null, struct + BNDnodeTheme.NOODLECURVING, value); }

    // -----------------------------------

    /** An array of {@link BNDnodeTheme} structs. */
    public static class Buffer extends StructBuffer<BNDnodeTheme, Buffer> implements NativeResource {

        private static final BNDnodeTheme ELEMENT_FACTORY = BNDnodeTheme.create(-1L);

        /**
         * Creates a new {@code BNDnodeTheme.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BNDnodeTheme#SIZEOF}, and its mark will be undefined.
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
        protected BNDnodeTheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NVGColor} view of the {@code nodeSelectedColor} field. */
        @NativeType("NVGcolor")
        public NVGColor nodeSelectedColor() { return BNDnodeTheme.nnodeSelectedColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code wiresColor} field. */
        @NativeType("NVGcolor")
        public NVGColor wiresColor() { return BNDnodeTheme.nwiresColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code textSelectedColor} field. */
        @NativeType("NVGcolor")
        public NVGColor textSelectedColor() { return BNDnodeTheme.ntextSelectedColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code activeNodeColor} field. */
        @NativeType("NVGcolor")
        public NVGColor activeNodeColor() { return BNDnodeTheme.nactiveNodeColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code wireSelectColor} field. */
        @NativeType("NVGcolor")
        public NVGColor wireSelectColor() { return BNDnodeTheme.nwireSelectColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code nodeBackdropColor} field. */
        @NativeType("NVGcolor")
        public NVGColor nodeBackdropColor() { return BNDnodeTheme.nnodeBackdropColor(address()); }
        /** Returns the value of the {@code noodleCurving} field. */
        public int noodleCurving() { return BNDnodeTheme.nnoodleCurving(address()); }

        /** Copies the specified {@link NVGColor} to the {@code nodeSelectedColor} field. */
        public BNDnodeTheme.Buffer nodeSelectedColor(@NativeType("NVGcolor") NVGColor value) { BNDnodeTheme.nnodeSelectedColor(address(), value); return this; }
        /** Passes the {@code nodeSelectedColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDnodeTheme.Buffer nodeSelectedColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(nodeSelectedColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code wiresColor} field. */
        public BNDnodeTheme.Buffer wiresColor(@NativeType("NVGcolor") NVGColor value) { BNDnodeTheme.nwiresColor(address(), value); return this; }
        /** Passes the {@code wiresColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDnodeTheme.Buffer wiresColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(wiresColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code textSelectedColor} field. */
        public BNDnodeTheme.Buffer textSelectedColor(@NativeType("NVGcolor") NVGColor value) { BNDnodeTheme.ntextSelectedColor(address(), value); return this; }
        /** Passes the {@code textSelectedColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDnodeTheme.Buffer textSelectedColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(textSelectedColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code activeNodeColor} field. */
        public BNDnodeTheme.Buffer activeNodeColor(@NativeType("NVGcolor") NVGColor value) { BNDnodeTheme.nactiveNodeColor(address(), value); return this; }
        /** Passes the {@code activeNodeColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDnodeTheme.Buffer activeNodeColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(activeNodeColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code wireSelectColor} field. */
        public BNDnodeTheme.Buffer wireSelectColor(@NativeType("NVGcolor") NVGColor value) { BNDnodeTheme.nwireSelectColor(address(), value); return this; }
        /** Passes the {@code wireSelectColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDnodeTheme.Buffer wireSelectColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(wireSelectColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code nodeBackdropColor} field. */
        public BNDnodeTheme.Buffer nodeBackdropColor(@NativeType("NVGcolor") NVGColor value) { BNDnodeTheme.nnodeBackdropColor(address(), value); return this; }
        /** Passes the {@code nodeBackdropColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDnodeTheme.Buffer nodeBackdropColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(nodeBackdropColor()); return this; }
        /** Sets the specified value to the {@code noodleCurving} field. */
        public BNDnodeTheme.Buffer noodleCurving(int value) { BNDnodeTheme.nnoodleCurving(address(), value); return this; }

    }

}