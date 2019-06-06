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
 * Describes the theme used to draw widgets.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code backgroundColor} &ndash; the background color of panels and windows</li>
 * <li>{@code regularTheme} &ndash; theme for labels</li>
 * <li>{@code toolTheme} &ndash; theme for tool buttons</li>
 * <li>{@code radioTheme} &ndash; theme for radio buttons</li>
 * <li>{@code textFieldTheme} &ndash; theme for text fields</li>
 * <li>{@code optionTheme} &ndash; theme for option buttons (checkboxes)</li>
 * <li>{@code choiceTheme} &ndash; theme for choice buttons (comboboxes) Blender calls them "menu buttons"</li>
 * <li>{@code numberFieldTheme} &ndash; theme for number fields</li>
 * <li>{@code sliderTheme} &ndash; theme for slider controls</li>
 * <li>{@code scrollBarTheme} &ndash; theme for scrollbars</li>
 * <li>{@code tooltipTheme} &ndash; theme for tooltips</li>
 * <li>{@code menuTheme} &ndash; theme for menu backgrounds</li>
 * <li>{@code menuItemTheme} &ndash; theme for menu items</li>
 * <li>{@code nodeTheme} &ndash; theme for nodes</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct BNDtheme {
 *     {@link NVGColor NVGcolor} backgroundColor;
 *     {@link BNDwidgetTheme BNDwidgetTheme} regularTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} toolTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} radioTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} textFieldTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} optionTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} choiceTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} numberFieldTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} sliderTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} scrollBarTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} tooltipTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} menuTheme;
 *     {@link BNDwidgetTheme BNDwidgetTheme} menuItemTheme;
 *     {@link BNDnodeTheme BNDnodeTheme} nodeTheme;
 * }</code></pre>
 */
public class BNDtheme extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BACKGROUNDCOLOR,
        REGULARTHEME,
        TOOLTHEME,
        RADIOTHEME,
        TEXTFIELDTHEME,
        OPTIONTHEME,
        CHOICETHEME,
        NUMBERFIELDTHEME,
        SLIDERTHEME,
        SCROLLBARTHEME,
        TOOLTIPTHEME,
        MENUTHEME,
        MENUITEMTHEME,
        NODETHEME;

    static {
        Layout layout = __struct(
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF),
            __member(BNDnodeTheme.SIZEOF, BNDnodeTheme.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BACKGROUNDCOLOR = layout.offsetof(0);
        REGULARTHEME = layout.offsetof(1);
        TOOLTHEME = layout.offsetof(2);
        RADIOTHEME = layout.offsetof(3);
        TEXTFIELDTHEME = layout.offsetof(4);
        OPTIONTHEME = layout.offsetof(5);
        CHOICETHEME = layout.offsetof(6);
        NUMBERFIELDTHEME = layout.offsetof(7);
        SLIDERTHEME = layout.offsetof(8);
        SCROLLBARTHEME = layout.offsetof(9);
        TOOLTIPTHEME = layout.offsetof(10);
        MENUTHEME = layout.offsetof(11);
        MENUITEMTHEME = layout.offsetof(12);
        NODETHEME = layout.offsetof(13);
    }

    /**
     * Creates a {@code BNDtheme} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BNDtheme(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NVGColor} view of the {@code backgroundColor} field. */
    @NativeType("NVGcolor")
    public NVGColor backgroundColor() { return nbackgroundColor(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code regularTheme} field. */
    public BNDwidgetTheme regularTheme() { return nregularTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code toolTheme} field. */
    public BNDwidgetTheme toolTheme() { return ntoolTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code radioTheme} field. */
    public BNDwidgetTheme radioTheme() { return nradioTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code textFieldTheme} field. */
    public BNDwidgetTheme textFieldTheme() { return ntextFieldTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code optionTheme} field. */
    public BNDwidgetTheme optionTheme() { return noptionTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code choiceTheme} field. */
    public BNDwidgetTheme choiceTheme() { return nchoiceTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code numberFieldTheme} field. */
    public BNDwidgetTheme numberFieldTheme() { return nnumberFieldTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code sliderTheme} field. */
    public BNDwidgetTheme sliderTheme() { return nsliderTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code scrollBarTheme} field. */
    public BNDwidgetTheme scrollBarTheme() { return nscrollBarTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code tooltipTheme} field. */
    public BNDwidgetTheme tooltipTheme() { return ntooltipTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code menuTheme} field. */
    public BNDwidgetTheme menuTheme() { return nmenuTheme(address()); }
    /** Returns a {@link BNDwidgetTheme} view of the {@code menuItemTheme} field. */
    public BNDwidgetTheme menuItemTheme() { return nmenuItemTheme(address()); }
    /** Returns a {@link BNDnodeTheme} view of the {@code nodeTheme} field. */
    public BNDnodeTheme nodeTheme() { return nnodeTheme(address()); }

    /** Copies the specified {@link NVGColor} to the {@code backgroundColor} field. */
    public BNDtheme backgroundColor(@NativeType("NVGcolor") NVGColor value) { nbackgroundColor(address(), value); return this; }
    /** Passes the {@code backgroundColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme backgroundColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(backgroundColor()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code regularTheme} field. */
    public BNDtheme regularTheme(BNDwidgetTheme value) { nregularTheme(address(), value); return this; }
    /** Passes the {@code regularTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme regularTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(regularTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code toolTheme} field. */
    public BNDtheme toolTheme(BNDwidgetTheme value) { ntoolTheme(address(), value); return this; }
    /** Passes the {@code toolTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme toolTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(toolTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code radioTheme} field. */
    public BNDtheme radioTheme(BNDwidgetTheme value) { nradioTheme(address(), value); return this; }
    /** Passes the {@code radioTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme radioTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(radioTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code textFieldTheme} field. */
    public BNDtheme textFieldTheme(BNDwidgetTheme value) { ntextFieldTheme(address(), value); return this; }
    /** Passes the {@code textFieldTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme textFieldTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(textFieldTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code optionTheme} field. */
    public BNDtheme optionTheme(BNDwidgetTheme value) { noptionTheme(address(), value); return this; }
    /** Passes the {@code optionTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme optionTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(optionTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code choiceTheme} field. */
    public BNDtheme choiceTheme(BNDwidgetTheme value) { nchoiceTheme(address(), value); return this; }
    /** Passes the {@code choiceTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme choiceTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(choiceTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code numberFieldTheme} field. */
    public BNDtheme numberFieldTheme(BNDwidgetTheme value) { nnumberFieldTheme(address(), value); return this; }
    /** Passes the {@code numberFieldTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme numberFieldTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(numberFieldTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code sliderTheme} field. */
    public BNDtheme sliderTheme(BNDwidgetTheme value) { nsliderTheme(address(), value); return this; }
    /** Passes the {@code sliderTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme sliderTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(sliderTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code scrollBarTheme} field. */
    public BNDtheme scrollBarTheme(BNDwidgetTheme value) { nscrollBarTheme(address(), value); return this; }
    /** Passes the {@code scrollBarTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme scrollBarTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(scrollBarTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code tooltipTheme} field. */
    public BNDtheme tooltipTheme(BNDwidgetTheme value) { ntooltipTheme(address(), value); return this; }
    /** Passes the {@code tooltipTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme tooltipTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(tooltipTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code menuTheme} field. */
    public BNDtheme menuTheme(BNDwidgetTheme value) { nmenuTheme(address(), value); return this; }
    /** Passes the {@code menuTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme menuTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(menuTheme()); return this; }
    /** Copies the specified {@link BNDwidgetTheme} to the {@code menuItemTheme} field. */
    public BNDtheme menuItemTheme(BNDwidgetTheme value) { nmenuItemTheme(address(), value); return this; }
    /** Passes the {@code menuItemTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme menuItemTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(menuItemTheme()); return this; }
    /** Copies the specified {@link BNDnodeTheme} to the {@code nodeTheme} field. */
    public BNDtheme nodeTheme(BNDnodeTheme value) { nnodeTheme(address(), value); return this; }
    /** Passes the {@code nodeTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDtheme nodeTheme(java.util.function.Consumer<BNDnodeTheme> consumer) { consumer.accept(nodeTheme()); return this; }

    /** Initializes this struct with the specified values. */
    public BNDtheme set(
        NVGColor backgroundColor,
        BNDwidgetTheme regularTheme,
        BNDwidgetTheme toolTheme,
        BNDwidgetTheme radioTheme,
        BNDwidgetTheme textFieldTheme,
        BNDwidgetTheme optionTheme,
        BNDwidgetTheme choiceTheme,
        BNDwidgetTheme numberFieldTheme,
        BNDwidgetTheme sliderTheme,
        BNDwidgetTheme scrollBarTheme,
        BNDwidgetTheme tooltipTheme,
        BNDwidgetTheme menuTheme,
        BNDwidgetTheme menuItemTheme,
        BNDnodeTheme nodeTheme
    ) {
        backgroundColor(backgroundColor);
        regularTheme(regularTheme);
        toolTheme(toolTheme);
        radioTheme(radioTheme);
        textFieldTheme(textFieldTheme);
        optionTheme(optionTheme);
        choiceTheme(choiceTheme);
        numberFieldTheme(numberFieldTheme);
        sliderTheme(sliderTheme);
        scrollBarTheme(scrollBarTheme);
        tooltipTheme(tooltipTheme);
        menuTheme(menuTheme);
        menuItemTheme(menuItemTheme);
        nodeTheme(nodeTheme);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BNDtheme set(BNDtheme src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BNDtheme} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BNDtheme malloc() {
        return wrap(BNDtheme.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BNDtheme} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BNDtheme calloc() {
        return wrap(BNDtheme.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BNDtheme} instance allocated with {@link BufferUtils}. */
    public static BNDtheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BNDtheme.class, memAddress(container), container);
    }

    /** Returns a new {@code BNDtheme} instance for the specified memory address. */
    public static BNDtheme create(long address) {
        return wrap(BNDtheme.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BNDtheme createSafe(long address) {
        return address == NULL ? null : wrap(BNDtheme.class, address);
    }

    /**
     * Returns a new {@link BNDtheme.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BNDtheme.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BNDtheme.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BNDtheme.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BNDtheme.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BNDtheme.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BNDtheme.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BNDtheme.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BNDtheme.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code BNDtheme} instance allocated on the thread-local {@link MemoryStack}. */
    public static BNDtheme mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BNDtheme} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BNDtheme callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BNDtheme} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BNDtheme mallocStack(MemoryStack stack) {
        return wrap(BNDtheme.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BNDtheme} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BNDtheme callocStack(MemoryStack stack) {
        return wrap(BNDtheme.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BNDtheme.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BNDtheme.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BNDtheme.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BNDtheme.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BNDtheme.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BNDtheme.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BNDtheme.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BNDtheme.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #backgroundColor}. */
    public static NVGColor nbackgroundColor(long struct) { return NVGColor.create(struct + BNDtheme.BACKGROUNDCOLOR); }
    /** Unsafe version of {@link #regularTheme}. */
    public static BNDwidgetTheme nregularTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.REGULARTHEME); }
    /** Unsafe version of {@link #toolTheme}. */
    public static BNDwidgetTheme ntoolTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.TOOLTHEME); }
    /** Unsafe version of {@link #radioTheme}. */
    public static BNDwidgetTheme nradioTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.RADIOTHEME); }
    /** Unsafe version of {@link #textFieldTheme}. */
    public static BNDwidgetTheme ntextFieldTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.TEXTFIELDTHEME); }
    /** Unsafe version of {@link #optionTheme}. */
    public static BNDwidgetTheme noptionTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.OPTIONTHEME); }
    /** Unsafe version of {@link #choiceTheme}. */
    public static BNDwidgetTheme nchoiceTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.CHOICETHEME); }
    /** Unsafe version of {@link #numberFieldTheme}. */
    public static BNDwidgetTheme nnumberFieldTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.NUMBERFIELDTHEME); }
    /** Unsafe version of {@link #sliderTheme}. */
    public static BNDwidgetTheme nsliderTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.SLIDERTHEME); }
    /** Unsafe version of {@link #scrollBarTheme}. */
    public static BNDwidgetTheme nscrollBarTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.SCROLLBARTHEME); }
    /** Unsafe version of {@link #tooltipTheme}. */
    public static BNDwidgetTheme ntooltipTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.TOOLTIPTHEME); }
    /** Unsafe version of {@link #menuTheme}. */
    public static BNDwidgetTheme nmenuTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.MENUTHEME); }
    /** Unsafe version of {@link #menuItemTheme}. */
    public static BNDwidgetTheme nmenuItemTheme(long struct) { return BNDwidgetTheme.create(struct + BNDtheme.MENUITEMTHEME); }
    /** Unsafe version of {@link #nodeTheme}. */
    public static BNDnodeTheme nnodeTheme(long struct) { return BNDnodeTheme.create(struct + BNDtheme.NODETHEME); }

    /** Unsafe version of {@link #backgroundColor(NVGColor) backgroundColor}. */
    public static void nbackgroundColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDtheme.BACKGROUNDCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #regularTheme(BNDwidgetTheme) regularTheme}. */
    public static void nregularTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.REGULARTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #toolTheme(BNDwidgetTheme) toolTheme}. */
    public static void ntoolTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.TOOLTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #radioTheme(BNDwidgetTheme) radioTheme}. */
    public static void nradioTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.RADIOTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #textFieldTheme(BNDwidgetTheme) textFieldTheme}. */
    public static void ntextFieldTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.TEXTFIELDTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #optionTheme(BNDwidgetTheme) optionTheme}. */
    public static void noptionTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.OPTIONTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #choiceTheme(BNDwidgetTheme) choiceTheme}. */
    public static void nchoiceTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.CHOICETHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #numberFieldTheme(BNDwidgetTheme) numberFieldTheme}. */
    public static void nnumberFieldTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.NUMBERFIELDTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #sliderTheme(BNDwidgetTheme) sliderTheme}. */
    public static void nsliderTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.SLIDERTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #scrollBarTheme(BNDwidgetTheme) scrollBarTheme}. */
    public static void nscrollBarTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.SCROLLBARTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #tooltipTheme(BNDwidgetTheme) tooltipTheme}. */
    public static void ntooltipTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.TOOLTIPTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #menuTheme(BNDwidgetTheme) menuTheme}. */
    public static void nmenuTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.MENUTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #menuItemTheme(BNDwidgetTheme) menuItemTheme}. */
    public static void nmenuItemTheme(long struct, BNDwidgetTheme value) { memCopy(value.address(), struct + BNDtheme.MENUITEMTHEME, BNDwidgetTheme.SIZEOF); }
    /** Unsafe version of {@link #nodeTheme(BNDnodeTheme) nodeTheme}. */
    public static void nnodeTheme(long struct, BNDnodeTheme value) { memCopy(value.address(), struct + BNDtheme.NODETHEME, BNDnodeTheme.SIZEOF); }

    // -----------------------------------

    /** An array of {@link BNDtheme} structs. */
    public static class Buffer extends StructBuffer<BNDtheme, Buffer> implements NativeResource {

        private static final BNDtheme ELEMENT_FACTORY = BNDtheme.create(-1L);

        /**
         * Creates a new {@code BNDtheme.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BNDtheme#SIZEOF}, and its mark will be undefined.
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
        protected BNDtheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NVGColor} view of the {@code backgroundColor} field. */
        @NativeType("NVGcolor")
        public NVGColor backgroundColor() { return BNDtheme.nbackgroundColor(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code regularTheme} field. */
        public BNDwidgetTheme regularTheme() { return BNDtheme.nregularTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code toolTheme} field. */
        public BNDwidgetTheme toolTheme() { return BNDtheme.ntoolTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code radioTheme} field. */
        public BNDwidgetTheme radioTheme() { return BNDtheme.nradioTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code textFieldTheme} field. */
        public BNDwidgetTheme textFieldTheme() { return BNDtheme.ntextFieldTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code optionTheme} field. */
        public BNDwidgetTheme optionTheme() { return BNDtheme.noptionTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code choiceTheme} field. */
        public BNDwidgetTheme choiceTheme() { return BNDtheme.nchoiceTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code numberFieldTheme} field. */
        public BNDwidgetTheme numberFieldTheme() { return BNDtheme.nnumberFieldTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code sliderTheme} field. */
        public BNDwidgetTheme sliderTheme() { return BNDtheme.nsliderTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code scrollBarTheme} field. */
        public BNDwidgetTheme scrollBarTheme() { return BNDtheme.nscrollBarTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code tooltipTheme} field. */
        public BNDwidgetTheme tooltipTheme() { return BNDtheme.ntooltipTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code menuTheme} field. */
        public BNDwidgetTheme menuTheme() { return BNDtheme.nmenuTheme(address()); }
        /** Returns a {@link BNDwidgetTheme} view of the {@code menuItemTheme} field. */
        public BNDwidgetTheme menuItemTheme() { return BNDtheme.nmenuItemTheme(address()); }
        /** Returns a {@link BNDnodeTheme} view of the {@code nodeTheme} field. */
        public BNDnodeTheme nodeTheme() { return BNDtheme.nnodeTheme(address()); }

        /** Copies the specified {@link NVGColor} to the {@code backgroundColor} field. */
        public BNDtheme.Buffer backgroundColor(@NativeType("NVGcolor") NVGColor value) { BNDtheme.nbackgroundColor(address(), value); return this; }
        /** Passes the {@code backgroundColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer backgroundColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(backgroundColor()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code regularTheme} field. */
        public BNDtheme.Buffer regularTheme(BNDwidgetTheme value) { BNDtheme.nregularTheme(address(), value); return this; }
        /** Passes the {@code regularTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer regularTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(regularTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code toolTheme} field. */
        public BNDtheme.Buffer toolTheme(BNDwidgetTheme value) { BNDtheme.ntoolTheme(address(), value); return this; }
        /** Passes the {@code toolTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer toolTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(toolTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code radioTheme} field. */
        public BNDtheme.Buffer radioTheme(BNDwidgetTheme value) { BNDtheme.nradioTheme(address(), value); return this; }
        /** Passes the {@code radioTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer radioTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(radioTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code textFieldTheme} field. */
        public BNDtheme.Buffer textFieldTheme(BNDwidgetTheme value) { BNDtheme.ntextFieldTheme(address(), value); return this; }
        /** Passes the {@code textFieldTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer textFieldTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(textFieldTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code optionTheme} field. */
        public BNDtheme.Buffer optionTheme(BNDwidgetTheme value) { BNDtheme.noptionTheme(address(), value); return this; }
        /** Passes the {@code optionTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer optionTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(optionTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code choiceTheme} field. */
        public BNDtheme.Buffer choiceTheme(BNDwidgetTheme value) { BNDtheme.nchoiceTheme(address(), value); return this; }
        /** Passes the {@code choiceTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer choiceTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(choiceTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code numberFieldTheme} field. */
        public BNDtheme.Buffer numberFieldTheme(BNDwidgetTheme value) { BNDtheme.nnumberFieldTheme(address(), value); return this; }
        /** Passes the {@code numberFieldTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer numberFieldTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(numberFieldTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code sliderTheme} field. */
        public BNDtheme.Buffer sliderTheme(BNDwidgetTheme value) { BNDtheme.nsliderTheme(address(), value); return this; }
        /** Passes the {@code sliderTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer sliderTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(sliderTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code scrollBarTheme} field. */
        public BNDtheme.Buffer scrollBarTheme(BNDwidgetTheme value) { BNDtheme.nscrollBarTheme(address(), value); return this; }
        /** Passes the {@code scrollBarTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer scrollBarTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(scrollBarTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code tooltipTheme} field. */
        public BNDtheme.Buffer tooltipTheme(BNDwidgetTheme value) { BNDtheme.ntooltipTheme(address(), value); return this; }
        /** Passes the {@code tooltipTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer tooltipTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(tooltipTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code menuTheme} field. */
        public BNDtheme.Buffer menuTheme(BNDwidgetTheme value) { BNDtheme.nmenuTheme(address(), value); return this; }
        /** Passes the {@code menuTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer menuTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(menuTheme()); return this; }
        /** Copies the specified {@link BNDwidgetTheme} to the {@code menuItemTheme} field. */
        public BNDtheme.Buffer menuItemTheme(BNDwidgetTheme value) { BNDtheme.nmenuItemTheme(address(), value); return this; }
        /** Passes the {@code menuItemTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer menuItemTheme(java.util.function.Consumer<BNDwidgetTheme> consumer) { consumer.accept(menuItemTheme()); return this; }
        /** Copies the specified {@link BNDnodeTheme} to the {@code nodeTheme} field. */
        public BNDtheme.Buffer nodeTheme(BNDnodeTheme value) { BNDtheme.nnodeTheme(address(), value); return this; }
        /** Passes the {@code nodeTheme} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDtheme.Buffer nodeTheme(java.util.function.Consumer<BNDnodeTheme> consumer) { consumer.accept(nodeTheme()); return this; }

    }

}