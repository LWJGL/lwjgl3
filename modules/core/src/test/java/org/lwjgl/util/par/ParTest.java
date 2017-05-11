/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.par;

import org.testng.annotations.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.par.ParShapes.*;
import static org.testng.Assert.*;

@Test
public class ParTest {

    public void testCylindersAndSpheres() {
        ParShapesMesh bad1 = par_shapes_create_cylinder(1, 1);
        ParShapesMesh bad2 = par_shapes_create_cylinder(1, 3);
        ParShapesMesh good = par_shapes_create_cylinder(3, 1);

        assertEquals(bad1, null);
        assertEquals(bad2, null);
        assertNotEquals(good, null);

        par_shapes_free_mesh(good);

        ParShapesMesh m = par_shapes_create_cylinder(5, 6);
        assertEquals(m.npoints(), 42);
        par_shapes_free_mesh(m);

        int slices, stacks;

        slices = 5;
        stacks = 6;
        m = par_shapes_create_cylinder(slices, stacks);
        assertEquals(m.ntriangles(), slices * stacks * 2);
        par_shapes_free_mesh(m);

        slices = 5;
        stacks = 6;
        m = par_shapes_create_parametric_sphere(slices, stacks);
        assertEquals(m.ntriangles(), slices * 2 + (stacks - 2) * slices * 2);
        par_shapes_free_mesh(m);

        slices = 12;
        stacks = 13;
        m = par_shapes_create_parametric_sphere(slices, stacks);
        assertEquals(m.ntriangles(), slices * 2 + (stacks - 2) * slices * 2);
        par_shapes_free_mesh(m);

        slices = 16;
        stacks = 16;
        m = par_shapes_create_parametric_sphere(slices, stacks);
        assertEquals(m.ntriangles(), slices * 2 + (stacks - 2) * slices * 2);
        par_shapes_free_mesh(m);
    }

    public void testMerge() {
        ParShapesMesh a = par_shapes_create_klein_bottle(10, 20);
        ParShapesMesh b = par_shapes_create_plane(3, 3);

        int npts  = a.npoints();
        int ntris = a.ntriangles();

        par_shapes_merge(a, b);

        assertEquals(a.npoints(), npts + b.npoints());
        assertEquals(a.ntriangles(), ntris + b.ntriangles());

        par_shapes_free_mesh(b);
        par_shapes_free_mesh(a);
    }

    public void testTransforms() {
        ParShapesMesh a, b;

        // should support translation
        a = par_shapes_create_cylinder(20, 3);
        b = par_shapes_create_cylinder(4, 3);

        par_shapes_translate(a, 0.5f, 0.5f, 0.25f);
        par_shapes_merge(a, b);

        par_shapes_free_mesh(b);
        par_shapes_free_mesh(a);

        // should support rotation

        a = par_shapes_create_cylinder(20, 3);
        b = par_shapes_create_cylinder(4, 3);

        FloatBuffer axis1 = memAllocFloat(3);
        axis1
            .put(0, 0.0f)
            .put(1, 1.0f)
            .put(2, 0.0f);

        FloatBuffer axis2 = memAllocFloat(3);
        axis2
            .put(0, 0.0f)
            .put(1, 0.0f)
            .put(2, 1.0f);

        par_shapes_rotate(a, (float)(Math.PI * 0.5), axis1);
        par_shapes_rotate(a, (float)(Math.PI * 0.25), axis2);

        par_shapes_merge(a, b);

        memFree(axis2);
        memFree(axis1);

        par_shapes_free_mesh(b);
        par_shapes_free_mesh(a);

        // should support non-uniform scale

        a = par_shapes_create_cylinder(15, 3);

        par_shapes_scale(a, 1.0f, 1.0f, 5.0f);

        par_shapes_free_mesh(a);
    }

    public void testMiscShapes() {
        // create an orientable disk in 3-space

        int slices = 32;

        FloatBuffer normal = memAllocFloat(3);
        normal
            .put(0, 0.0f)
            .put(1, 0.0f)
            .put(2, 1.0f);

        FloatBuffer center = memAllocFloat(3);
        center
            .put(0, 0.0f)
            .put(1, 0.0f)
            .put(2, 0.0f);

        ParShapesMesh a, b;

        a = par_shapes_create_disk(1.0f, slices, center, normal);

        normal
            .put(0, 0.0f)
            .put(1, 1.0f)
            .put(2, 0.0f);
        center
            .put(0, 0.0f)
            .put(1, 0.0f)
            .put(2, 0.2f);

        b = par_shapes_create_disk(0.2f, slices, center, normal);

        par_shapes_merge(a, b);

        par_shapes_free_mesh(b);
        par_shapes_free_mesh(a);

        // create a rock on the Y plane

        slices = 32;
        center
            .put(0, 0.0f)
            .put(1, 0.0f)
            .put(2, 0.0f);

        a = par_shapes_create_disk(2.0f, slices, center, normal);
        b = par_shapes_create_rock(1, 2);

        FloatBuffer aabb = memAllocFloat(6);
        par_shapes_compute_aabb(b, aabb);

        par_shapes_translate(b, 0, -aabb.get(1) / 2, 0);

        par_shapes_merge(a, b);

        memFree(aabb);

        par_shapes_free_mesh(b);
        par_shapes_free_mesh(a);

        // create a polyhedron on the Y plane

        a = par_shapes_create_disk(2.0f, slices, center, normal);
        b = par_shapes_create_dodecahedron();

        par_shapes_translate(b, 0, 0.934f, 0);

        par_shapes_merge(a, b);

        par_shapes_free_mesh(b);
        par_shapes_free_mesh(a);

        memFree(center);
        memFree(normal);

        // create a rounded cylinder via composition

        FloatBuffer O          = memAllocFloat(3);
        FloatBuffer I          = memAllocFloat(3);
        FloatBuffer J          = memAllocFloat(3);
        FloatBuffer K          = memAllocFloat(3);
        FloatBuffer top_center = memAllocFloat(3);

        O
            .put(0, 0.0f)
            .put(1, 0.0f)
            .put(2, 0.0f);

        I
            .put(0, 1.0f)
            .put(1, 0.0f)
            .put(2, 0.0f);

        J
            .put(0, 0.0f)
            .put(1, 1.0f)
            .put(2, 0.0f);

        K
            .put(0, 0.0f)
            .put(1, 0.0f)
            .put(2, 1.0f);

        top_center
            .put(0, 0.0f)
            .put(1, 1.2f)
            .put(2, 0.0f);

        int tess = 30;

        a = par_shapes_create_disk(2.5f, tess, O, J);
        b = par_shapes_create_cylinder(tess, 3);
        ParShapesMesh c = par_shapes_create_torus(15, tess, 0.1f);
        ParShapesMesh d = par_shapes_create_disk(1, tess, top_center, J);

        par_shapes_rotate(c, (float)(Math.PI / tess), K);
        par_shapes_translate(c, 0, 0, 1);
        par_shapes_scale(b, 1.2f, 1.2f, 1);

        par_shapes_merge(b, c);

        par_shapes_rotate(b, (float)(-Math.PI * 0.5), I);

        par_shapes_merge(b, d);
        par_shapes_merge(b, a);

        par_shapes_scale(b, 1, 2, 1);

        par_shapes_free_mesh(d);
        par_shapes_free_mesh(c);
        par_shapes_free_mesh(b);
        par_shapes_free_mesh(a);

        memFree(top_center);
        memFree(K);
        memFree(J);
        memFree(I);
        memFree(O);
    }

    public void testLSystems() {
        String program =
            "sx 2 sy 2" +
            " ry 90 rx 90" +
            " shape tube rx 15  call rlimb rx -15" +
            " shape tube rx -15 call llimb rx 15" +
            " shape tube ry 15  call rlimb ry -15" +
            " shape tube ry 15  call llimb ry -15" +
            " rule rlimb" +
            "     sx 0.925 sy 0.925 tz 1 rx 1.2" +
            "     call rlimb2" +
            " rule rlimb2.1" +
            "     shape connect" +
            "     call rlimb" +
            " rule rlimb2.1" +
            "     rx 15  shape tube call rlimb rx -15" +
            "     rx -15 shape tube call llimb rx 15" +
            " rule rlimb.1" +
            "     call llimb" +
            " rule llimb.1" +
            "     call rlimb" +
            " rule llimb.10" +
            "     sx 0.925 sy 0.925" +
            "     tz 1" +
            "     rx -1.2" +
            "     shape connect" +
            "     call llimb";

        FloatBuffer O = memAllocFloat(3);
        FloatBuffer J = memAllocFloat(3);

        O
            .put(0, 0.0f)
            .put(1, 0.0f)
            .put(2, 0.0f);

        J
            .put(0, 0.0f)
            .put(1, 1.0f)
            .put(2, 0.0f);

        ParShapesMesh mesh = par_shapes_create_lsystem(program, 5, 60);
        ParShapesMesh disk = par_shapes_create_disk(10, 30, O, J);

        par_shapes_merge(mesh, disk);

        par_shapes_free_mesh(disk);
        par_shapes_free_mesh(mesh);

        memFree(J);
        memFree(O);
    }

}