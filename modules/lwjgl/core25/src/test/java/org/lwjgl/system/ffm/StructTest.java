/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.lwjgl.sdl.*;
import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.lang.annotation.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.nio.*;
import java.nio.charset.*;
import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.SegmentStack.*;
import static org.lwjgl.system.ffm.FFM.*;
import static org.testng.Assert.*;

@NullMarked
@Test
public class StructTest {

    // Use a custom annotation to test that everything works without jspecify in the classpath
    @Target({ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyNullable {
    }

    static {
        ffmConfig(
            StructTest.class,
            ffmConfigBuilder(MethodHandles.lookup())
                .withNullableAnnotation(MyNullable.class)
                .build());
    }

    private static void assertEqualsSegment(MemorySegment actual, MemorySegment expected) {
        assertEquals(actual.address(), expected.address());
        assertEquals(actual.byteSize(), expected.byteSize());
    }

    public void testEmpty() {
        interface Empty {
            StructBinder<Empty> $ = struct(Empty.class)
                .build();
        }

        var layout = Empty.$.layout();

        assertEquals(Empty.$.sizeof(), 0);
        assertEquals(Empty.$.alignof(), 1);
        assertTrue(layout.memberLayouts().isEmpty());

        try (var stack = stackPush()) {
            var empty = Empty.$.allocate(stack);
            assertEquals(empty.byteSize(), 0);
        }
    }

    public void testBinderName() {
        interface StructType {
            StructBinder<StructType> THIS_CAN_BE_ANYTHING = struct(StructType.class)
                .build();
        }

        var layout = StructType.THIS_CAN_BE_ANYTHING.layout();

        assertEquals(layout.toString(), "[](StructType)");
    }

    public void testBinderWrongClass() {
        interface AnotherStructType {
            StructBinder<AnotherStructType> $ = struct(AnotherStructType.class)
                .build();
        }

        interface StructType {
            StructBinder<AnotherStructType> $ = struct(AnotherStructType.class)
                .build();
        }

        assertEquals(AnotherStructType.$.layout().toString(), "[](AnotherStructType)");
        assertEquals(StructType.$.layout().toString(), "[](AnotherStructType)");

        interface Caller {
            void test(@MyNullable StructType s);
        }

        var caller = ffmGenerate(Caller.class);
        //noinspection DataFlowIssue
        assertThrows(() -> caller.test(null));

        interface StructParent {
            StructBinder<StructParent> $ = struct(StructParent.class)
                .m("child", StructType.$)
                .build();

            @SuppressWarnings("unused")
            StructType child();
        }
        assertThrows(() -> Objects.requireNonNull(StructParent.$));
    }

    public void testBinderMultipleNotAllowed() {
        interface StructType {
            StructBinder<StructType> $0 = struct(StructType.class)
                .build();
            StructBinder<StructType> $1 = struct(StructType.class)
                .build();
        }

        assertThrows(() -> Objects.requireNonNull(StructType.$0));
        assertThrows(() -> Objects.requireNonNull(StructType.$1));

        interface Caller {
            void test(@MyNullable StructType s);
        }

        var caller = ffmGenerate(Caller.class);
        //noinspection DataFlowIssue
        assertThrows(() -> caller.test(null));

        interface StructParent {
            StructBinder<StructParent> $ = struct(StructParent.class)
                .m("child", StructType.$0)
                .build();
        }
        assertThrows(() -> Objects.requireNonNull(StructParent.$));
    }

    public void testSimple() {
        interface Simple {
            StructBinder<Simple> $ = struct(Simple.class)
                .m("a", int32_t)
                .build();

            int a();
            Simple a(int a);
        }

        var layout = Simple.$.layout();

        assertEquals(Simple.$.sizeof(), 4L);
        assertEquals(Simple.$.alignof(), 4L);
        assertEquals(layout.memberLayouts().size(), 1);
        assertEquals(layout.select(groupElement(0)), int32_t.withName("a"));
        assertEquals(layout.select(groupElement("a")), int32_t.withName("a"));

        try (var stack = stackPush()) {
            stack.push();

            {
                var simpleMS = Simple.$.allocate(stack); // note zeroing zeroing allocation
                assertEquals(simpleMS.byteSize(), 4);

                var simple = Simple.$.get(simpleMS);
                assertEquals(simple.a(), 0);
                simple.a(0xBAADF00D);
                assertEquals(simple.a(), 0xBAADF00D);
            }

            stack.pop();

            {
                var simpleMS = Simple.$.malloc(stack); // note non-zeroing allocation
                assertEquals(simpleMS.byteSize(), 4);

                var simple = Simple.$.get(simpleMS);
                assertEquals(simple.a(), 0xBAADF00D); // dirty memory!
                simple.a(0);
                assertEquals(simple.a(), 0);
            }
        }
    }

    public void testFFMName() {
        {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("a", int32_t)
                    .build();

                int b();
                S b(int b);
            }
            assertThrows(() -> Objects.requireNonNull(S.$));
        }

        {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("a", int32_t)
                    .build();

                @FFMName("a") int b();
            }
            Objects.requireNonNull(S.$.layout());
        }
    }

    public void testLayoutPaddingInvalid() {
        interface StructWithPaddingInternal {
            StructBinder<StructWithPaddingInternal> $ = struct(StructWithPaddingInternal.class)
                .automaticPadding(false)
                .m("a", int32_t)
                .m("b", int64_t)
                .build();
        }
        assertThrows(() -> Objects.requireNonNull(StructWithPaddingInternal.$));

        interface StructWithPaddingTail {
            StructBinder<StructWithPaddingTail> $ = struct(StructWithPaddingTail.class)
                .automaticPadding(false)
                .m("a", int64_t)
                .m("b", int32_t)
                .build();
        }
        assertThrows(() -> Objects.requireNonNull(StructWithPaddingTail.$));

        interface StructWithPaddingTailNoCheck {
            StructBinder<StructWithPaddingTailNoCheck> $ = struct(StructWithPaddingTailNoCheck.class)
                .automaticPadding(false)
                .checkPadding(false)
                .m("a", int64_t)
                .m("b", int32_t)
                .build();
        }
        assertEquals(StructWithPaddingTailNoCheck.$.layout().toString(), "[j8(a)i4(b)](StructWithPaddingTailNoCheck)");

        try (var arena = Arena.ofConfined()) {
            assertNotNull(StructWithPaddingTailNoCheck.$.allocate(arena));
            assertThrows(() -> StructWithPaddingTailNoCheck.$.allocate(arena, 2L));
        }
    }

    public void testLayoutPaddingExplicit() {
        interface StructWithPaddingInternal {
            StructBinder<StructWithPaddingInternal> $ = struct(StructWithPaddingInternal.class)
                .automaticPadding(false)
                .m("a", int32_t)
                .padding(4L)
                .m("b", int64_t)
                .build();
        }
        assertEquals(StructWithPaddingInternal.$.layout().toString(), "[i4(a)x4j8(b)](StructWithPaddingInternal)");

        interface StructWithPaddingTail {
            StructBinder<StructWithPaddingTail> $ = struct(StructWithPaddingTail.class)
                .automaticPadding(false)
                .m("a", int64_t)
                .m("b", int32_t)
                .padding(4L)
                .build();
        }
        assertEquals(StructWithPaddingTail.$.layout().toString(), "[j8(a)i4(b)x4](StructWithPaddingTail)");
    }

    private static void check(GroupLayout layout, List<MemoryLayout> members, int index, long byteSize, long byteOffset) {
        assertEquals(members.get(index).byteSize(), byteSize);
        assertEquals(layout.byteOffset(groupElement(index)), byteOffset);
    }

    private static void check(GroupLayout layout, List<MemoryLayout> members, int index, long byteSize, long byteOffset, String name) {
        assertEquals(members.get(index).byteSize(), byteSize);
        assertEquals(layout.byteOffset(groupElement(index)), byteOffset);
        assertEquals(layout.byteOffset(groupElement(name)), byteOffset);
    }

    public void testLayout() {
        {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("a", int8_t)
                    .m("b", int16_t)
                    .m("c", int32_t)
                    .m("d", int64_t)
                    .build();
            }

            var layout  = S.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 5);

            check(layout, members, 0, 1L, 0L, "a");
            check(layout, members, 1, 1L, 1L); // automatic padding element
            check(layout, members, 2, 2L, 2L, "b");
            check(layout, members, 3, 4L, 4L, "c");
            check(layout, members, 4, 8L, 8L, "d");

            assertEquals(S.$.alignof(), 8L);
            assertEquals(S.$.sizeof(), 16L);
        }

        {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("a", int64_t)
                    .m("b", int32_t)
                    .m("c", int16_t)
                    .m("d", int8_t)
                    .build();
            }

            var layout  = S.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 5);

            check(layout, members, 0, 8L, 0L, "a");
            check(layout, members, 1, 4L, 8L, "b");
            check(layout, members, 2, 2L, 12L, "c");
            check(layout, members, 3, 1L, 14L, "d");
            check(layout, members, 4, 1L, 15L); // automatic padding element

            assertEquals(S.$.alignof(), 8L);
            assertEquals(S.$.sizeof(), 16L);
        }
    }

    public void testLayoutCustomAlignment() {
        {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .alignas(8L)
                    .m("a", int32_t)
                    .m("b", int32_t)
                    .m("c", int32_t)
                    .m("d", int32_t)
                    .build();
            }

            var layout  = S.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 4);

            check(layout, members, 0, 4L, 0L, "a");
            check(layout, members, 1, 4L, 4L, "b");
            check(layout, members, 2, 4L, 8L, "c");
            check(layout, members, 3, 4L, 12L, "d");

            assertEquals(S.$.alignof(), 8L);
            assertEquals(S.$.sizeof(), 16L);
        }

        {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .alignas(32L)
                    .m("a", int32_t)
                    .m("b", int32_t)
                    .m("c", int32_t)
                    .m("d", int32_t)
                    .build();
            }

            var layout  = S.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 5);

            check(layout, members, 0, 4L, 0L, "a");
            check(layout, members, 1, 4L, 4L, "b");
            check(layout, members, 2, 4L, 8L, "c");
            check(layout, members, 3, 4L, 12L, "d");
            check(layout, members, 4, 16L, 16L); // automatic padding element

            assertEquals(S.$.alignof(), 32L);
            assertEquals(S.$.sizeof(), 32L);

            interface P1 {
                StructBinder<P1> $ = struct(P1.class)
                    .m("s", S.$)
                    .m("i", int32_t)
                    .build();
            }

            layout = P1.$.layout();
            members = layout.memberLayouts();

            assertEquals(members.size(), 3);

            check(layout, members, 0, 32L, 0L, "s");
            check(layout, members, 1, 4L, 32L, "i");
            check(layout, members, 2, 28L, 36L); // automatic padding element

            assertEquals(P1.$.alignof(), 32L);
            assertEquals(P1.$.sizeof(), 64L);

            interface P2 {
                StructBinder<P1> $ = struct(P1.class)
                    .m("i", int32_t)
                    .m("s", S.$)
                    .build();
            }

            layout = P2.$.layout();
            members = layout.memberLayouts();

            assertEquals(members.size(), 3);

            check(layout, members, 0, 4L, 0L, "i");
            check(layout, members, 1, 28L, 4L); // automatic padding element
            check(layout, members, 2, 32L, 32L, "s");

            assertEquals(P2.$.alignof(), 32L);
            assertEquals(P2.$.sizeof(), 64L);
        }
    }

    public void testLayoutCustomPackAligment() {
        interface PackUtil {
            static <T> StructBinder<T> struct(Class<T> structClass, long byteAlignment) {
                return FFM.struct(structClass)
                    .pack(byteAlignment)
                    .m("a", int8_t)
                    .m("b", int16_t)
                    .m("c", int64_t)
                    // TODO: support alignas on struct members?
                    // MSVC: alignas(32) on a member of a packed struct forces 32-bit alignment for both the member and the struct
                    // GCC/Clang: alignas on a member of a packed struct is ignored
                    .m("d", int64_t.withByteAlignment(32L))
                    .m("e", int8_t)
                    .m("f", int64_t)
                    .build();
            }
        }

        {
            interface Packed1 {
                StructBinder<Packed1> $ = PackUtil.struct(Packed1.class, 1L);
            }

            var layout  = Packed1.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 6);

            check(layout, members, 0, 1L, 0L, "a");
            check(layout, members, 1, 2L, 1L, "b");
            check(layout, members, 2, 8L, 3L, "c");
            check(layout, members, 3, 8L, 11L, "d");
            check(layout, members, 4, 1L, 19L, "e");
            check(layout, members, 5, 8L, 20L, "f");

            assertEquals(Packed1.$.alignof(), 1L);
            assertEquals(Packed1.$.sizeof(), 28L);
        }

        {
            interface Packed2 {
                StructBinder<Packed2> $ = PackUtil.struct(Packed2.class, 2L);
            }

            var layout  = Packed2.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 8);

            check(layout, members, 0, 1L, 0L, "a");
            check(layout, members, 1, 1L, 1L);
            check(layout, members, 2, 2L, 2L, "b");
            check(layout, members, 3, 8L, 4L, "c");
            check(layout, members, 4, 8L, 12L, "d");
            check(layout, members, 5, 1L, 20L, "e");
            check(layout, members, 6, 1L, 21L);
            check(layout, members, 7, 8L, 22L, "f");

            assertEquals(Packed2.$.alignof(), 2L);
            assertEquals(Packed2.$.sizeof(), 30L);
        }

        {
            interface Packed4 {
                StructBinder<Packed4> $ = PackUtil.struct(Packed4.class, 4L);
            }

            var layout  = Packed4.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 8);

            check(layout, members, 0, 1L, 0L, "a");
            check(layout, members, 1, 1L, 1L);
            check(layout, members, 2, 2L, 2L, "b");
            check(layout, members, 3, 8L, 4L, "c");
            check(layout, members, 4, 8L, 12L, "d");
            check(layout, members, 5, 1L, 20L, "e");
            check(layout, members, 6, 3L, 21L);
            check(layout, members, 7, 8L, 24L, "f");

            assertEquals(Packed4.$.alignof(), 4L);
            assertEquals(Packed4.$.sizeof(), 32L);
        }

        {
            interface Packed8 {
                StructBinder<Packed8> $ = PackUtil.struct(Packed8.class, 8L);
            }

            var layout  = Packed8.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 9);

            check(layout, members, 0, 1L, 0L, "a");
            check(layout, members, 1, 1L, 1L);
            check(layout, members, 2, 2L, 2L, "b");
            check(layout, members, 3, 4L, 4L);
            check(layout, members, 4, 8L, 8L, "c");
            check(layout, members, 5, 8L, 16L, "d");
            check(layout, members, 6, 1L, 24L, "e");
            check(layout, members, 7, 7L, 25L);
            check(layout, members, 8, 8L, 32L, "f");

            assertEquals(Packed8.$.alignof(), 8L);
            assertEquals(Packed8.$.sizeof(), 40L);
        }
    }

    public void testFFMInterop() {
        interface S {
            StructBinder<S> $ = struct(S.class)
                .m("z", int8_t)
                .m("b", int8_t)
                .m("s", int16_t)
                .m("i", int32_t)
                .m("j", int64_t)
                .m("f", float32)
                .m("d", float64)
                .build();

            boolean z();
            byte b();
            short s();
            int i();
            long j();
            float f();
            double d();

            S z(boolean z);
            S b(byte b);
            S s(short s);
            S i(int i);
            S j(long j);
            S f(float f);
            S d(double d);
        }

        try (var arena = Arena.ofConfined()) {
            var segment = S.$.allocate(arena);
            var s       = S.$.get(segment);

            assertFalse(s.z());
            assertEquals(s.b(), (byte)0);
            assertEquals(s.s(), (short)0);
            assertEquals(s.i(), 0);
            assertEquals(s.j(), 0L);
            assertEquals(s.f(), 0.0f);
            assertEquals(s.d(), 0.0);

            s
                .z(true)
                .b((byte)0x7F)
                .s((short)0x7FFF)
                .i(0x7FFFFFFF)
                .j(0x7FFFFFFFFFFFFFFFL)
                .f(3.14f)
                .d(2.718281828459045);

            assertTrue(s.z());
            assertEquals(s.b(), (byte)0x7F);
            assertEquals(s.s(), (short)0x7FFF);
            assertEquals(s.i(), 0x7FFFFFFF);
            assertEquals(s.j(), 0x7FFFFFFFFFFFFFFFL);
            assertEquals(s.f(), 3.14f);
            assertEquals(s.d(), 2.718281828459045);

            var layout = S.$.layout();

            assertTrue(segment.get(int8_t, layout.byteOffset(groupElement("z"))) != 0);
            assertEquals(segment.get(int8_t, layout.byteOffset(groupElement("b"))), s.b());
            assertEquals(segment.get(int16_t, layout.byteOffset(groupElement("s"))), s.s());
            assertEquals(segment.get(int32_t, layout.byteOffset(groupElement("i"))), s.i());
            assertEquals(segment.get(int64_t, layout.byteOffset(groupElement("j"))), s.j());
            assertEquals(segment.get(float32, layout.byteOffset(groupElement("f"))), s.f());
            assertEquals(segment.get(float64, layout.byteOffset(groupElement("d"))), s.d());

            var offset = 0L;
            for (var member : S.$.layout().memberLayouts()) {
                if (member instanceof PaddingLayout) {
                    for (var i = offset; i < offset + member.byteSize(); i++) {
                        assertEquals(segment.get(ValueLayout.JAVA_BYTE, i), (byte)0);
                    }
                }
                offset += member.byteSize();
            }

            // Test java.lang.Record components

            var components = s.getClass().getRecordComponents();
            assertNotNull(components);

            assertEquals(components.length, 7);
            assertEquals(components[0].getName(), "z");
            assertEquals(components[0].getType(), boolean.class);
            assertEquals(components[1].getName(), "b");
            assertEquals(components[1].getType(), byte.class);
            assertEquals(components[2].getName(), "s");
            assertEquals(components[2].getType(), short.class);
            assertEquals(components[3].getName(), "i");
            assertEquals(components[3].getType(), int.class);
            assertEquals(components[4].getName(), "j");
            assertEquals(components[4].getType(), long.class);
            assertEquals(components[5].getName(), "f");
            assertEquals(components[5].getType(), float.class);
            assertEquals(components[6].getName(), "d");
            assertEquals(components[6].getType(), double.class);
        }
    }

    public void testFFMAlignment() {
        try (var arena = Arena.ofConfined()) {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("a", int32_t)
                    .m("b", int64_t)
                    .build();

                int a();
                long b();
            }

            var segment = S.$.allocate(arena, 10);

            Objects.requireNonNull(S.$.get(segment));
            Objects.requireNonNull(S.$.get(segment, 7 * S.$.sizeof()));
            Objects.requireNonNull(S.$.getAtIndex(segment, 7));

            assertThrows(() -> S.$.get(segment.asSlice(4L)));
            assertThrows(() -> S.$.get(segment, 4L));
            assertThrows(() -> S.$.getAtIndex(segment.asSlice(4L), 0));
        }
    }

    public void testIteration() {
        interface S {
            StructBinder<S> $ = struct(S.class)
                .m("a", int32_t)
                .m("b", int64_t)
                .build();

            int a();
            long b();

            S a(int a);
            S b(long b);
        }


        try (var arena = Arena.ofConfined()) {
            var segment = S.$.allocate(arena, 10);
            segment.fill((byte)0x01);

            var i = 0;
            var l = 0L;
            for (var s : S.$.iterable(segment)) {
                i += s.a();
                l += s.b();
            }

            assertEquals(i, 0x0101_0101 * 10);
            assertEquals(l, 0x0101_0101_0101_0101L * 10);

            S.$.forEach(segment, it -> it
                .a(0x0202_0202)
                .b(0x0202_0202_0202_0202L));

            assertEquals(S.$.stream(segment).mapToInt(S::a).sum(), 0x0202_0202 * 10);
            assertEquals(S.$.stream(segment).mapToLong(S::b).sum(), 0x0202_0202_0202_0202L * 10);

            for (var index = 0; index < 10; index++) {
                S.$.applyAtIndex(segment, index, S.$::clear);
            }

            assertEquals(S.$.parallelStream(segment).mapToInt(S::a).sum(), 0);
            assertEquals(S.$.parallelStream(segment).mapToLong(S::b).sum(), 0);

            var iterator = S.$.iterator(segment);

            var index = 0;
            while (iterator.hasNext()) {
                iterator.next()
                    .a(0x0101_0101 * index)
                    .b(0x0101_0101_0101_0101L * index);
                index++;
            }

            index = 0;
            for (var s : S.$.array(segment)) {
                assertEquals(s.a(), 0x0101_0101 * index);
                assertEquals(s.b(), 0x0101_0101_0101_0101L * index);
                index++;
            }
        }
    }

    public void testNesting() {
        interface Inner {
            StructBinder<Inner> $ = struct(Inner.class)
                .m("a", int32_t)
                .m("b", int64_t)
                .build();

            int a();
            long b();

            Inner a(int a);
            Inner b(long b);
        }

        try (var arena = Arena.ofConfined()) {
            interface Outer {
                StructBinder<Outer> $ = struct(Outer.class)
                    .m("c", float32)
                    .m("inner", Inner.$)
                    .m("d", float64)
                    .build();

                float c();
                Inner inner();
                double d();

                Outer c(float c);
                Outer inner(Inner inner);
                Outer d(double d);
            }

            var segment = Outer.$.allocate(arena);

            var outer       = Outer.$.get(segment);
            var inner       = outer.inner();
            var innerOffset = Outer.$.layout().byteOffset(groupElement("inner"));

            assertEquals(
                Inner.$.addressOf(inner),
                Outer.$.addressOf(outer) + innerOffset
            );

            assertEquals(outer.c(), 0.0f);
            assertEquals(inner.a(), 0);
            assertEquals(inner.b(), 0L);
            assertEquals(outer.d(), 0.0f);

            outer.c(3.14f);
            inner.a(42);
            inner.b(0x7FFFFFFFFFFFFFFFL);
            outer.d(2.718281828459045);

            assertEquals(outer.c(), 3.14f);
            assertEquals(inner.a(), 42);
            assertEquals(inner.b(), 0x7FFFFFFFFFFFFFFFL);
            assertEquals(outer.d(), 2.718281828459045);

            assertEquals(segment.get(float32, Outer.$.layout().byteOffset(groupElement("c"))), outer.c());
            assertEquals(segment.get(int32_t, innerOffset + Inner.$.layout().byteOffset(groupElement("a"))), inner.a());
            assertEquals(segment.get(int64_t, innerOffset + Inner.$.layout().byteOffset(groupElement("b"))), inner.b());
            assertEquals(segment.get(float64, Outer.$.layout().byteOffset(groupElement("d"))), outer.d());

            var innerBuffer = Inner.$.allocate(arena);
            var innerOther  = Inner.$.get(innerBuffer);

            innerOther.a(0xDEADBEEF);
            innerOther.b(0xFEEDFACECAFEBABEL);

            assertEquals(innerOther.a(), 0xDEADBEEF);
            assertEquals(innerOther.b(), 0xFEEDFACECAFEBABEL);

            assertNotEquals(
                Inner.$.addressOf(inner),
                Inner.$.addressOf(innerOther)
            );

            outer.inner(innerOther);

            assertEquals(inner.a(), 0xDEADBEEF);
            assertEquals(inner.b(), 0xFEEDFACECAFEBABEL);

            assertEquals(inner, innerOther); // test generated equals method
        }

        try (var arena = Arena.ofConfined()) {
            interface Outer {
                StructBinder<Outer> $ = struct(Outer.class)
                    .m("c", float32)
                    .m("inner", p(Inner.$))
                    .m("d", float64)
                    .build();

                float c();
                @MyNullable Inner inner();
                double d();

                Outer c(float c);
                Outer inner(@MyNullable Inner inner);
                Outer d(double d);
            }

            var segment = Outer.$.allocate(arena);

            var outer = Outer.$.get(segment);

            assertEquals(outer.c(), 0.0f);
            //noinspection DataFlowIssue
            assertNull(outer.inner());
            assertEquals(outer.d(), 0.0f);

            var innerBuffer = Inner.$.allocate(arena);
            var inner       = Inner.$.get(innerBuffer);

            assertEquals(inner.a(), 0);
            assertEquals(inner.b(), 0L);

            outer.c(3.14f);
            outer.inner(inner);
            outer.d(2.718281828459045);

            inner.a(42);
            inner.b(0x7FFFFFFFFFFFFFFFL);

            assertEquals(outer.c(), 3.14f);
            assertEquals(Inner.$.addressOfSafe(outer.inner()), Inner.$.addressOf(inner));
            assertEquals(outer.d(), 2.718281828459045);
            assertEquals(inner.a(), 42);
            assertEquals(inner.b(), 0x7FFFFFFFFFFFFFFFL);

            assertEquals(segment.get(float32, Outer.$.layout().byteOffset(groupElement("c"))), outer.c());
            assertEquals(segment.get(uintptr_t, Outer.$.layout().byteOffset(groupElement("inner"))).address(), Inner.$.addressOf(inner));
            assertEquals(segment.get(float64, Outer.$.layout().byteOffset(groupElement("d"))), outer.d());

            assertEquals(innerBuffer.get(int32_t, Inner.$.layout().byteOffset(groupElement("a"))), inner.a());
            assertEquals(innerBuffer.get(int64_t, Inner.$.layout().byteOffset(groupElement("b"))), inner.b());

            outer.inner(null);
            assertNull(outer.inner());
            assertEquals(segment.get(uintptr_t, Outer.$.layout().byteOffset(groupElement("inner"))).address(), NULL);
        }
    }

    public void testUnion() {
        interface A {
            StructBinder<A> $ = struct(A.class)
                .m("a", int8_t)
                .m("b", int8_t)
                .m("c", int8_t)
                .m("d", int8_t)
                .build();

            byte a();
            byte b();
            byte c();
            byte d();

            A a(byte a);
            A b(byte b);
            A c(byte c);
            A d(byte d);

            default void checkValues(int value) {
                assertEquals(a(), (byte)((value >> 24) & 0xFF));
                assertEquals(b(), (byte)((value >> 16) & 0xFF));
                assertEquals(c(), (byte)((value >> 8) & 0xFF));
                assertEquals(d(), (byte)((value >> 0) & 0xFF));
            }
        }

        {
            var layout  = A.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 4);

            check(layout, members, 0, 1L, 0L, "a");
            check(layout, members, 1, 1L, 1L, "b");
            check(layout, members, 2, 1L, 2L, "c");
            check(layout, members, 3, 1L, 3L, "d");
        }

        interface B {
            UnionBinder<B> $ = union(B.class)
                .m("i", int32_t)
                .m("f", float32)
                .build();

            int i();
            float f();

            B i(int i);
            B f(float f);

            default void checkValues(MemorySegment segment, int value) {
                assertEquals(i(), value);
                assertEquals(segment.get(int32_t, 0), value);
                assertEquals(f(), Float.intBitsToFloat(value));
                assertEquals(segment.get(float32, 0), Float.intBitsToFloat(value));
            }

            default void checkf() {
                assertEquals(f(), Float.intBitsToFloat(i()));
            }
        }

        {
            var layout  = B.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 2);

            check(layout, members, 0, 4L, 0L, "i");
            check(layout, members, 1, 4L, 0L, "f");
        }

        interface U {
            UnionBinder<U> $ = union(U.class)
                .m("A", A.$)
                .m("B", B.$)
                .build();

            A A();
            B B();

            U A(A a);
            U B(B b);
        }

        {
            var layout  = U.$.layout();
            var members = layout.memberLayouts();

            assertEquals(members.size(), 2);
            assertEquals(U.$.sizeof(), max(
                A.$.sizeof(),
                B.$.sizeof()
            ));

            check(layout, members, 0, A.$.sizeof(), 0L, "A");
            check(layout, members, 1, B.$.sizeof(), 0L, "B");
        }

        try (var arena = Arena.ofConfined()) {
            var segment = U.$.allocate(arena);

            var u = U.$.get(segment);

            var a = u.A();
            var b = u.B();

            a.checkValues(0);
            b.checkValues(segment, 0x0000_0000);

            var LE = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;

            a.a((byte)0x7F);

            a.checkValues(0x7F00_0000);
            b.checkValues(segment, LE ? 0x0000_007F : 0x7F00_0000);

            a
                .a((byte)0)
                .b((byte)0x7F);

            a.checkValues(0x007F_0000);
            b.checkValues(segment, LE ? 0x0000_7F00 : 0x007F_0000);

            a
                .b((byte)0)
                .c((byte)0x7F);

            a.checkValues(0x0000_7F00);
            b.checkValues(segment, LE ? 0x007F_0000 : 0x0000_7F00);

            a
                .c((byte)0)
                .d((byte)0x7F);

            a.checkValues(0x0000_007F);
            b.checkValues(segment, LE ? 0x7F00_0000 : 0x0000_007F);

            b.i(0);
            b.checkf();
            a.checkValues(0);

            b.i(LE ? 0x0000_007F : 0x7F00_0000);
            b.checkf();
            a.checkValues(0x7F00_0000);

            b.i(LE ? 0x007F_0000 : 0x0000_7F00);
            b.checkf();
            a.checkValues(0x0000_7F00);

            b.i(LE ? 0x0000_7F00 : 0x007F_0000);
            b.checkf();
            a.checkValues(0x007F_0000);

            b.i(LE ? 0x7F00_0000 : 0x0000_007F);
            b.checkf();
            a.checkValues(0x0000_007F);
        }
    }

    public void testUnionInheritance() {
        interface BaseEvent {
            int type();
            BaseEvent type(int value);
        }

        interface CommonEvent extends BaseEvent {
            StructBinder<CommonEvent> $ = struct(CommonEvent.class)
                .m("type", int32_t)
                .m("timestamp", uint64_t)
                .build();

            long timestamp();
            CommonEvent timestamp(long value);
        }

        interface KeyboardEvent extends CommonEvent {
            StructBinder<KeyboardEvent> $ = struct(KeyboardEvent.class)
                .m("type", int32_t)
                .m("timestamp", uint64_t)
                .m("key", int32_t)
                .m("mod", int16_t)
                .m("down", uint8_t)
                .build();

            int key();
            boolean down();

            KeyboardEvent key(int value);
            KeyboardEvent down(boolean value);
        }

        interface MouseEvent extends CommonEvent {
            StructBinder<MouseEvent> $ = struct(MouseEvent.class)
                .m("type", int32_t)
                .m("timestamp", uint64_t)
                .m("button", int32_t)
                .m("down", uint8_t)
                .m("x", float32)
                .m("y", float32)
                .build();

            int button();
            boolean down();
            float x();
            float y();

            MouseEvent button(int value);
            MouseEvent down(boolean value);
            MouseEvent x(float value);
            MouseEvent y(float value);
        }

        interface Event extends BaseEvent {
            UnionBinder<Event> $ = union(Event.class)
                .m("type", int32_t)
                .m("common", CommonEvent.$)
                .m("key", KeyboardEvent.$)
                .m("mouse", MouseEvent.$)
                .build();

            CommonEvent common();
            KeyboardEvent key();
            MouseEvent mouse();

            Event common(CommonEvent value);
            Event key(KeyboardEvent value);
            Event mouse(MouseEvent value);
        }

        Objects.requireNonNull(Event.$);

        try (var arena = Arena.ofConfined()) {
            var segment = Event.$.allocate(arena);

            var union = Event.$.get(segment);

            var t = System.currentTimeMillis();

            union.type(0xFEEDBEEF);
            union.common().timestamp(t);

            assertEquals(union.type(), 0xFEEDBEEF);
            assertEquals(union.common().timestamp(), t);

            assertEquals(union.key().type(), union.type());
            assertEquals(union.key().timestamp(), union.common().timestamp());

            assertEquals(union.mouse().type(), union.type());
            assertEquals(union.mouse().timestamp(), union.common().timestamp());
        }
    }

    public void testFFMSize() {
        try (var arena = Arena.ofConfined()) {
            interface S8 {
                StructBinder<S8> $ = struct(S8.class)
                    .m("buffer", p(int8_t))
                    .m("size", int8_t)
                    .build();

                @FFMSize("size") MemorySegment buffer();
                byte size();

                S8 buffer(MemorySegment buffer);
                S8 size(byte size);
            }

            var segment = S8.$.allocate(arena);
            var s       = S8.$.get(segment);

            assertEqualsSegment(s.buffer(), MemorySegment.NULL);
            //assertThrows(NullPointerException.class, s::buffer);
            assertEquals(s.size(), (byte)0);

            var buffer = arena.allocate(int8_t, 0xFFL);

            s
                .buffer(buffer)
                .size((byte)0xFF);

            assertEqualsSegment(s.buffer(), buffer);
            assertEquals(s.size() & 0xFF, 0xFF);
        }

        try (var arena = Arena.ofConfined()) {
            interface S16 {
                StructBinder<S16> $ = struct(S16.class)
                    .m("buffer", p(int8_t))
                    .m("size", int16_t)
                    .build();

                @FFMSize("size") MemorySegment buffer();
                short size();

                S16 buffer(MemorySegment buffer);
                S16 size(short size);
            }

            var segment = S16.$.allocate(arena);
            var s       = S16.$.get(segment);

            assertEqualsSegment(s.buffer(), MemorySegment.NULL);
            //assertThrows(NullPointerException.class, s::buffer);
            assertEquals(s.size(), (short)0);

            var buffer = arena.allocate(int8_t, 0xFFL);

            s
                .buffer(buffer)
                .size((short)0xFF);

            assertEqualsSegment(s.buffer(), buffer);
            assertEquals(s.size() & 0xFF, 0xFF);
        }

        try (var arena = Arena.ofConfined()) {
            interface S32 {
                StructBinder<S32> $ = struct(S32.class)
                    .m("buffer", p(int8_t))
                    .m("size", int32_t)
                    .build();

                @FFMSize("size") MemorySegment buffer();
                int size();

                S32 buffer(MemorySegment buffer);
                S32 size(int size);
            }

            var segment = S32.$.allocate(arena);
            var s       = S32.$.get(segment);

            assertEqualsSegment(s.buffer(), MemorySegment.NULL);
            //assertThrows(NullPointerException.class, s::buffer);
            assertEquals(s.size(), 0);

            var buffer = arena.allocate(int8_t, 0xFFL);

            s
                .buffer(buffer)
                .size(0xFF);

            assertEqualsSegment(s.buffer(), buffer);
            assertEquals(s.size() & 0xFF, 0xFF);
        }

        try (var arena = Arena.ofConfined()) {
            interface S64 {
                StructBinder<S64> $ = struct(S64.class)
                    .m("buffer", p(int8_t))
                    .m("size", int64_t)
                    .build();

                @FFMSize("size") MemorySegment buffer();
                long size();

                S64 buffer(MemorySegment buffer);
                S64 size(long size);
            }

            var segment = S64.$.allocate(arena);
            var s       = S64.$.get(segment);

            assertEqualsSegment(s.buffer(), MemorySegment.NULL);
            //assertThrows(NullPointerException.class, s::buffer);
            assertEquals(s.size(), 0L);

            var buffer = arena.allocate(int8_t, 0xFFL);

            s
                .buffer(buffer)
                .size(0xFFL);

            assertEqualsSegment(s.buffer(), buffer);
            assertEquals(s.size() & 0xFFL, 0xFFL);
        }
    }

    public void testAliasingObject() {
        {
            interface Invalid {
                StructBinder<Invalid> $ = struct(Invalid.class)
                    .m("equals", uint8_t)
                    .build();

                boolean equals();
                @SuppressWarnings("CovariantEquals")
                Invalid equals(boolean value);
            }
            assertThrows(() -> Objects.requireNonNull(Invalid.$));
        }

        {
            interface Valid {
                StructBinder<Valid> $ = struct(Valid.class)
                    .m("equals", uint8_t)
                    .build();

                @FFMName("equals")
                boolean myEquals();

                @FFMName("equals")
                Valid myEquals(boolean value);
            }
            Objects.requireNonNull(Valid.$);
        }

        {
            interface Invalid {
                StructBinder<Invalid> $ = struct(Invalid.class)
                    .m("hashCode", int32_t)
                    .build();

                int hashCode();
                Invalid hashCode(int value);
            }
            assertThrows(() -> Objects.requireNonNull(Invalid.$));
        }

        {
            interface Valid {
                StructBinder<Valid> $ = struct(Valid.class)
                    .m("hashCode", int32_t)
                    .build();

                @FFMName("hashCode")
                int myHashCode();

                @FFMName("hashCode")
                Valid myHashCode(int value);
            }
            Objects.requireNonNull(Valid.$);
        }

        {
            @FFMCharset(FFMCharset.Type.UTF8)
            interface Invalid {
                StructBinder<Invalid> $ = struct(Invalid.class)
                    .m("toString", FFM.array(int8_t, 128))
                    .build();

                String toString();
                Invalid toString(String value);
            }
            assertThrows(() -> Objects.requireNonNull(Invalid.$));
        }

        {
            @FFMCharset(FFMCharset.Type.UTF8)
            interface Valid {
                StructBinder<Valid> $ = struct(Valid.class)
                    .m("toString", FFM.array(int8_t, 128))
                    .build();

                @FFMName("toString")
                String myToString();

                @FFMName("toString")
                Valid myToString(String value);
            }
            Objects.requireNonNull(Valid.$);
        }
    }

    public void testEquals() {
        try (var arena = Arena.ofConfined()) {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("x", int32_t)
                    .m("y", int32_t)
                    .build();

                int x();
                int y();

                S x(int x);
                S y(int y);
            }

            var segment = S.$.allocate(arena, 2);

            var a = S.$.getAtIndex(segment, 0);
            var b = S.$.getAtIndex(segment, 1);

            assertNotEquals(S.$.addressOf(a), S.$.addressOf(b));
            assertNotSame(a, b);

            {
                assertEquals(a.x(), 0);
                assertEquals(a.y(), 0);

                assertEquals(b.x(), 0);
                assertEquals(b.y(), 0);

                assertEquals(a, b);
            }

            {
                a.x(0xDEADBEEF);
                a.y(0xFEEDFACE);

                assertEquals(a.x(), 0xDEADBEEF);
                assertEquals(a.y(), 0xFEEDFACE);

                assertEquals(b.x(), 0);
                assertEquals(b.y(), 0);

                assertNotEquals(a, b);
            }

            {
                b.x(0xDEADBEEF);
                b.y(0xFEEDFACE);

                assertEquals(a.x(), 0xDEADBEEF);
                assertEquals(a.y(), 0xFEEDFACE);

                assertEquals(b.x(), 0xDEADBEEF);
                assertEquals(b.y(), 0xFEEDFACE);

                assertEquals(a, b);
            }
        }

        try (var arena = Arena.ofConfined()) {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("x", int32_t)
                    .m("y", int32_t)
                    .withEquals((s1, o) -> {
                        var s2 = (S)o;
                        return s1.x() == s2.x(); // intentionally only x
                    })
                    .build();

                int x();
                int y();

                S x(int x);
                S y(int y);
            }

            var segment = S.$.allocate(arena, 2);

            var a = S.$.getAtIndex(segment, 0);
            var b = S.$.getAtIndex(segment, 1);

            assertNotEquals(S.$.addressOf(a), S.$.addressOf(b));
            assertNotSame(a, b);

            {
                assertEquals(a.x(), 0);
                assertEquals(a.y(), 0);

                assertEquals(b.x(), 0);
                assertEquals(b.y(), 0);

                assertEquals(a, b);
            }

            {
                a.x(0xDEADBEEF);
                a.y(0xFEEDFACE);

                assertEquals(a.x(), 0xDEADBEEF);
                assertEquals(a.y(), 0xFEEDFACE);

                assertEquals(b.x(), 0);
                assertEquals(b.y(), 0);

                assertNotEquals(a, b);
            }

            {
                b.x(0xDEADBEEF);

                assertEquals(a.x(), 0xDEADBEEF);
                assertEquals(a.y(), 0xFEEDFACE);

                assertEquals(b.x(), 0xDEADBEEF);
                assertEquals(b.y(), 0);

                assertEquals(a, b);
            }
        }
    }

    public void testHashCode() {
        try (var arena = Arena.ofConfined()) {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("x", int32_t)
                    .m("y", int32_t)
                    .build();

                int x();
                int y();

                S x(int x);
                S y(int y);
            }

            var segment = S.$.allocate(arena, 2);

            var a = S.$.getAtIndex(segment, 0);
            var b = S.$.getAtIndex(segment, 1);

            assertNotEquals(S.$.addressOf(a), S.$.addressOf(b));
            assertNotSame(a, b);

            {
                assertEquals(a.x(), 0);
                assertEquals(a.y(), 0);

                assertEquals(b.x(), 0);
                assertEquals(b.y(), 0);

                assertEquals(a.hashCode(), b.hashCode());
            }

            {
                a.x(0xDEADBEEF);
                a.y(0xFEEDFACE);

                assertEquals(a.x(), 0xDEADBEEF);
                assertEquals(a.y(), 0xFEEDFACE);

                assertEquals(b.x(), 0);
                assertEquals(b.y(), 0);

                assertNotEquals(a.hashCode(), b.hashCode());
            }

            {
                b.x(0xDEADBEEF);
                b.y(0xFEEDFACE);

                assertEquals(a.x(), 0xDEADBEEF);
                assertEquals(a.y(), 0xFEEDFACE);

                assertEquals(b.x(), 0xDEADBEEF);
                assertEquals(b.y(), 0xFEEDFACE);

                assertEquals(a.hashCode(), b.hashCode());
            }
        }

        try (var arena = Arena.ofConfined()) {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("x", int32_t)
                    .m("y", int32_t)
                    .withHashCode((s) -> Integer.hashCode(s.x())) // intentionally only x
                    .build();

                int x();
                int y();

                S x(int x);
                S y(int y);
            }

            var segment = S.$.allocate(arena, 2);

            var a = S.$.getAtIndex(segment, 0);
            var b = S.$.getAtIndex(segment, 1);

            assertNotEquals(S.$.addressOf(a), S.$.addressOf(b));
            assertNotSame(a, b);

            {
                assertEquals(a.x(), 0);
                assertEquals(a.y(), 0);

                assertEquals(b.x(), 0);
                assertEquals(b.y(), 0);

                assertEquals(a.hashCode(), b.hashCode());
            }

            {
                a.x(0xDEADBEEF);
                a.y(0xFEEDFACE);

                assertEquals(a.x(), 0xDEADBEEF);
                assertEquals(a.y(), 0xFEEDFACE);

                assertEquals(b.x(), 0);
                assertEquals(b.y(), 0);

                assertNotEquals(a.hashCode(), b.hashCode());
            }

            {
                b.x(0xDEADBEEF);

                assertEquals(a.x(), 0xDEADBEEF);
                assertEquals(a.y(), 0xFEEDFACE);

                assertEquals(b.x(), 0xDEADBEEF);
                assertEquals(b.y(), 0);

                assertEquals(a.hashCode(), b.hashCode());
            }
        }
    }

    public void testToString() {
        try (var arena = Arena.ofConfined()) {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("x", int32_t)
                    .m("y", int32_t)
                    .m("pointer", p(int32_t))
                    .build();

                int x();
                int y();
                MemorySegment pointer();

                S x(int x);
                S y(int y);
                S pointer(MemorySegment pointer);
            }

            var segment = S.$.allocate(arena);

            var s = S.$.get(segment);

            assertEquals(s.x(), 0);
            assertEquals(s.y(), 0);
            assertEqualsSegment(s.pointer(), MemorySegment.NULL);
            //assertThrows(NullPointerException.class, s::pointer);
            assertEquals(s.toString(), "S[x=0, y=0, pointer=0x0]");

            s
                .x(12345)
                .y(54321)
                .pointer(segment);

            var matcher = Pattern.compile("(?<=address: )0x[0-9a-f]+")
                .matcher(segment.toString());

            assertTrue(matcher.find());
            assertEquals(s.toString(), "S[x=12345, y=54321, pointer=" + matcher.group(0) + "]");
        }

        try (var arena = Arena.ofConfined()) {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("x", int32_t)
                    .m("y", int32_t)
                    .m("pointer", p(array(int32_t, 16)))
                    .withToString(s -> "My S Rendering: x=" + s.x() + ", y=" + s.y() + ", pointer=" + s.pointer())
                    .build();

                int x();
                int y();
                MemorySegment pointer();

                S x(int x);
                S y(int y);
                S pointer(MemorySegment pointer);
            }

            var segment = S.$.allocate(arena);

            var s = S.$.get(segment);

            assertEquals(s.x(), 0);
            assertEquals(s.y(), 0);
            assertEqualsSegment(s.pointer(), MemorySegment.NULL);
            //assertThrows(NullPointerException.class, s::pointer);
            assertEquals(s.toString(), "My S Rendering: x=0, y=0, pointer=" + MemorySegment.NULL);

            var buffer = arena.allocate(int32_t, 16);

            s
                .x(12345)
                .y(54321)
                .pointer(buffer);

            assertEquals(s.toString(), "My S Rendering: x=12345, y=54321, pointer=" + buffer);
        }
    }

    public void testFFMCanonical() {
        {
            // test multiple getters without FFMCanonical
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("text", array(int8_t, 256))
                    .build();

                @FFMName("text") String foo();
                @FFMName("text") MemorySegment bar();
            }
            assertThrows(() -> Objects.requireNonNull(S.$));
        }
        {
            // test multiple getters without FFMCanonical, but custom equals/hashCode/toString
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("text", array(int8_t, 256))
                    .withEquals((s1, o) -> {
                        var s2 = (S)o;
                        return s1.foo().equals(s2.foo());
                    })
                    .withHashCode(it -> it.foo().hashCode())
                    .withToString(S::foo)
                    .build();

                @FFMName("text") String foo();
                @FFMName("text") MemorySegment bar();
            }
            Objects.requireNonNull(S.$);
        }
        {
            // test multiple getters with multiple FFMCanonical
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("text", array(int8_t, 256))
                    .build();

                @FFMCanonical @FFMName("text") String foo();
                @FFMCanonical @FFMName("text") MemorySegment bar();
            }
            assertThrows(() -> Objects.requireNonNull(S.$));
        }
        try (var arena = Arena.ofConfined()) {
            // test multiple getters with single FFMCanonical (1)
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("text", array(int8_t, 256))
                    .build();

                @FFMCanonical @FFMName("text") String foo();
                @FFMName("text") MemorySegment bar();
            }
            Objects.requireNonNull(S.$);

            var segment = S.$.allocate(arena);
            assertEquals("S[text=]", S.$.get(segment).toString());
        }
        try (var arena = Arena.ofConfined()) {
            // test multiple getters with single FFMCanonical (2)
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("text", array(int8_t, 256))
                    .build();

                @FFMName("text") String foo();
                @FFMCanonical @FFMName("text") MemorySegment bar();
            }
            Objects.requireNonNull(S.$);

            var segment = S.$.allocate(arena);
            assertEquals("S[text=MemorySegment{ kind: native, address: 0x" + Long.toHexString(segment.address()) + ", byteSize: 256 }]", S.$.get(segment).toString());
        }
    }

    public void testBoolean() {
        {
            interface Invalid {
                StructBinder<Invalid> $ = struct(Invalid.class)
                    .m("b", int64_t) // supported up to 32-bits
                    .build();

                boolean b();
            }

            assertThrows(() -> Objects.requireNonNull(Invalid.$));
        }

        try (var arena = Arena.ofConfined()) {
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("a", int8_t)
                    .m("b", int16_t)
                    .m("c", int32_t)
                    .build();

                boolean a();
                boolean b();
                boolean c();

                S a(boolean a);
                S b(boolean b);
                S c(boolean c);
            }

            var layout = S.$.layout();

            var members = layout.memberLayouts();

            assertEquals(members.size(), 4);

            check(layout, members, 0, 1L, 0L, "a");
            check(layout, members, 1, 1L, 1L); // automatic padding element
            check(layout, members, 2, 2L, 2L, "b");
            check(layout, members, 3, 4L, 4L, "c");

            assertEquals(S.$.alignof(), 4L);
            assertEquals(S.$.sizeof(), 8L);

            var segment = S.$.allocate(arena);

            var s = S.$.get(segment);

            assertFalse(s.a());
            assertFalse(s.b());
            assertFalse(s.c());

            s.a(true);

            assertTrue(s.a());
            assertFalse(s.b());
            assertFalse(s.c());
            assertEquals(segment.get(int64_t, 0L), 0x0000_0000_0000_0001L);

            segment.set(int8_t, 0L, (byte)0xFF); // dirty bits
            s.a(true);
            assertEquals(segment.get(int64_t, 0L), 0x0000_0000_0000_0001L);

            s
                .a(false)
                .b(true);

            assertFalse(s.a());
            assertTrue(s.b());
            assertFalse(s.c());
            assertEquals(segment.get(int64_t, 0L), 0x0000_0000_0001_0000L);

            segment.set(int16_t, 2L, (short)0xFFFF); // dirty bits
            s.b(true);
            assertEquals(segment.get(int64_t, 0L), 0x0000_0000_0001_0000L);

            s
                .b(false)
                .c(true);

            assertFalse(s.a());
            assertFalse(s.b());
            assertTrue(s.c());
            assertEquals(segment.get(int64_t, 0L), 0x0000_0001_0000_0000L);

            segment.set(int32_t, 4L, 0xFFFF_FFFF); // dirty bits
            s.c(true);
            assertEquals(segment.get(int64_t, 0L), 0x0000_0001_0000_0000L);
        }
    }

    public void testCLong() {
        interface S {
            StructBinder<S> $ = struct(S.class)
                .m("x", clong)
                .m("y", clong)
                .build();

            long x();
            long y();

            S x(long x);
            S y(long y);
        }

        try (var arena = Arena.ofConfined()) {
            var layout = S.$.layout();

            var members = layout.memberLayouts();

            assertEquals(members.size(), 2);

            check(layout, members, 0, Pointer.CLONG_SIZE, 0L, "x");
            check(layout, members, 1, Pointer.CLONG_SIZE, Pointer.CLONG_SIZE, "y");

            assertEquals(S.$.alignof(), Pointer.CLONG_SIZE);
            assertEquals(S.$.sizeof(), 2 * Pointer.CLONG_SIZE);

            var segment = S.$.allocate(arena);

            var s = S.$.get(segment);

            assertEquals(s.x(), 0L);
            assertEquals(s.y(), 0L);

            s
                .x(0x7FFF_FFFF_7FFF_FFFFL)
                .y(0xFFFF_FFFF_FFFF_FFFFL);

            assertEquals(s.x(), Pointer.CLONG_SIZE == 8 ? 0x7FFF_FFFF_7FFF_FFFFL : 0x7FFF_FFFF);
            assertEquals(s.y(), Pointer.CLONG_SIZE == 8 ? 0xFFFF_FFFF_FFFF_FFFFL : 0xFFFF_FFFF);
        }
    }

    public void testString() {
        try (var arena = Arena.ofConfined()) {
            @FFMCharset(FFMCharset.Type.UTF8)
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("a", array(int8_t, 256))
                    .m("b", array(int8_t, 256))
                    .build();

                String a();
                String b();

                S a(String value);
                S b(String value);
            }

            var segment = S.$.allocate(arena);

            var s = S.$.get(segment);

            assertEquals(s.a(), "");
            assertEquals(s.b(), "");

            assertEquals(s.toString(), "S[a=, b=]");

            s
                .a("hello")
                .b("world!");

            assertEquals(s.a(), "hello");
            assertEquals(s.b(), "world!");

            assertEquals(s.toString(), "S[a=hello, b=world!]");
        }

        try (var arena = Arena.ofConfined()) {
            @FFMCharset(FFMCharset.Type.UTF8)
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("a", array(int8_t, 256))
                    .m("b", array(int8_t, 256))
                    .withToString(it -> it.a() + " " + it.b())
                    .build();

                String a();
                String b();

                S a(String value);
                S b(String value);
            }

            var segment = S.$.allocate(arena);

            var s = S.$.get(segment);

            assertEquals(s.a(), "");
            assertEquals(s.b(), "");

            assertEquals(s.toString(), " ");

            s
                .a("hello")
                .b("world!");

            assertEquals(s.a(), "hello");
            assertEquals(s.b(), "world!");

            assertEquals(s.toString(), "hello world!");
        }

        try (var arena = Arena.ofConfined()) {
            @FFMCharset(FFMCharset.Type.UTF8)
            interface S {
                StructBinder<S> $ = struct(S.class)
                    .m("pointerNT", p(int8_t))
                    .m("pointer", p(int8_t))
                    .m("pointerLength", int32_t)

                    .m("arrayNT", FFM.array(int8_t, 256))
                    .m("array", FFM.array(int8_t, 256))
                    .m("arrayLength", int32_t)

                    .build();

                @MyNullable String pointerNT();
                @FFMSize("pointerLength") @MyNullable String pointer();
                int pointerLength();

                String arrayNT();
                @FFMSize("arrayLength") String array();
                int arrayLength();

                // TODO:
                //@NullTerminated @FFMName("pointerNT") MemorySegment pointerNTSegment();
                @FFMSize("pointerLength") @FFMName("pointer") MemorySegment pointerSegment();

                // TODO:
                //@NullTerminated @FFMName("arrayNT") MemorySegment arrayNTSegment();
                @FFMSize("arrayLength") @FFMName("array") MemorySegment arraySegment();

                S pointerNT(MemorySegment value);
                S pointer(MemorySegment value);
                S pointerLength(int value);

                S arrayNT(String value);
                S array(@FFMSize("arrayLength") String value);
                S arrayLength(int value);
            }

            var layout = S.$.layout();

            var members = layout.memberLayouts();

            assertEquals(members.size(), 6);
            assertEquals(S.$.sizeof(), uintptr_t.byteSize() * 2 + 4L + 256L + 256L + 4L);
            assertEquals(S.$.alignof(), uintptr_t.byteAlignment());

            var segment = S.$.allocate(arena);

            var s = S.$.get(segment);

            var helloNT = arena.allocateFrom("γεια σου", StandardCharsets.UTF_8);
            var worldNT = arena.allocateFrom("κόσμε!", StandardCharsets.UTF_8);

            var hello = helloNT.reinterpret(helloNT.byteSize() - 1);
            var world = worldNT.reinterpret(worldNT.byteSize() - 1);

            {
                //noinspection DataFlowIssue
                assertNull(s.pointerNT());
                assertNull(s.pointer());
                assertEquals(s.pointerLength(), 0);
                assertEqualsSegment(s.pointerSegment(), MemorySegment.NULL);
                //assertThrows(NullPointerException.class, s::pointerSegment);

                s.pointerNT(helloNT);

                assertEquals(s.pointerNT(), "γεια σου");
                assertNull(s.pointer());
                assertEquals(s.pointerLength(), 0);
                assertEqualsSegment(s.pointerSegment(), MemorySegment.NULL);
                //assertThrows(NullPointerException.class, s::pointerSegment);

                s.pointer(hello);

                assertEquals(s.pointerNT(), "γεια σου");
                assertEquals(s.pointer(), "");
                assertEquals(s.pointerLength(), 0);
                assertEquals(s.pointerSegment().byteSize(), 0L);

                s.pointerLength((int)hello.byteSize());

                assertEquals(s.pointerNT(), "γεια σου");
                assertEquals(s.pointer(), "γεια σου");
                assertEquals(s.pointerLength(), (int)hello.byteSize());
                assertEquals(s.pointerSegment().address(), hello.address());
                assertEquals(s.pointerSegment().byteSize(), hello.byteSize());
            }

            {
                assertEquals(
                    s.arraySegment().address(),
                    S.$.addressOf(s) + layout.byteOffset(groupElement("array"))
                );

                assertEquals(s.arrayNT(), "");
                assertEquals(s.array(), "");
                assertEquals(s.arrayLength(), 0);
                assertEquals(s.arraySegment().byteSize(), 0L);

                s.arrayNT("κόσμε!");

                assertEquals(s.arrayNT(), "κόσμε!");
                assertEquals(s.array(), "");
                assertEquals(s.arrayLength(), 0);
                assertEquals(s.arraySegment().byteSize(), 0L);

                s.array("κόσμε!");

                assertEquals(s.arrayNT(), "κόσμε!");
                assertEquals(s.array(), "");
                assertEquals(s.arrayLength(), 0);
                assertEquals(s.arraySegment().byteSize(), 0L);

                s.arrayLength((int)world.byteSize());

                assertEquals(s.arrayNT(), "κόσμε!");
                assertEquals(s.array(), "κόσμε!");
                assertEquals(s.arrayLength(), (int)world.byteSize());
                assertEquals(s.arraySegment().byteSize(), world.byteSize());
            }

            assertEquals(
                s.toString(),
                "S[pointerNT=0x" + Long.toHexString(helloNT.address()) + ", pointer=0x" + Long.toHexString(helloNT.address()) + ", pointerLength=" + hello.byteSize() + ", arrayNT=κόσμε!, array=κόσμε!, arrayLength=" + world.byteSize() + "]"
            );
        }
    }

    private static final ValueLayout.OfByte Uint8 = typedef("Uint8", uint8_t);

    public void testFFMByValue() {
        interface SDL_GUID {
            StructBinder<SDL_GUID> $ = struct(SDL_GUID.class)
                .m("data", array(Uint8, 16))
                .build();

            MemorySegment data();
        }

        @FFMCharset(FFMCharset.Type.US_ASCII)
        @FFMPrefix("SDL_")
        @FFMFunctionAddress
        interface SDL_guid_h {
            @FFMByValue SDL_GUID StringToGUID(MemorySegment SDL_StringToGUID, SegmentAllocator allocator, String pchGUID);
            void GUIDToString(MemorySegment SDL_GUIDToString, @FFMByValue SDL_GUID guid, MemorySegment pszGUID, int cbGUID);
        }

        var SDL = ffmGenerate(SDL_guid_h.class);

        var SDL_StringToGUID = MemorySegment.ofAddress(SDLGUID.Functions.StringToGUID);
        var SDL_GUIDToString = MemorySegment.ofAddress(SDLGUID.Functions.GUIDToString);

        try (var arena = Arena.ofConfined()) {
            var guid = SDL.StringToGUID(SDL_StringToGUID, arena, "1234567890abcdef1234567890abcdef");

            assertEquals(
                guid.data().get(uint64_t, 0L),
                guid.data().get(uint64_t, 8L)
            );

            var segment = arena.allocate(Uint8, 33);

            SDL.GUIDToString(SDL_GUIDToString, guid, segment, (int)segment.byteSize());

            assertEquals(segment.getString(0L), "1234567890abcdef1234567890abcdef");
        }
    }

    public void testCapabilityPointer() {
        {
            // test aliasing
            interface Invalid extends Pointer {
                StructBinder<Invalid> $ = struct(Invalid.class)
                    .m("address", uint64_t)
                    .build();

                @SuppressWarnings("override")
                long address();
                Invalid address(long value);
            }
            assertThrows(() -> Objects.requireNonNull(Invalid.$));

            interface Valid extends Pointer {
                StructBinder<Valid> $ = struct(Valid.class)
                    .m("address", uint64_t)
                    .build();

                @FFMName("address")
                long myAddress();

                @FFMName("address")
                Valid myAddress(long value);
            }
            Objects.requireNonNull(Valid.$);
        }

        try (var arena = Arena.ofConfined()) {
            interface S extends Pointer {
                StructBinder<S> $ = struct(S.class)
                    .m("a", int32_t)
                    .m("b", int32_t)
                    .build();
            }

            var segment = S.$.allocate(arena);

            var s = S.$.get(segment);

            assertEquals(s.address(), segment.address());
        }
    }

    public void testCapabilityNativeResource() {
        interface S extends NativeResource {
            StructBinder<S> $ = struct(S.class)
                .m("a", int32_t)
                .m("b", int32_t)
                .build();

            int a();
            int b();

            S a(int a);
            S b(int b);
        }

        var memory = nmemAlloc(S.$.sizeof());

        try (var s = S.$.ofAddress(memory)) {
            s.a(42);
            s.b(84);

            assertEquals(s.a(), 42);
            assertEquals(s.b(), 84);
        }
    }

}