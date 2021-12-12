package com.josullivan.basicshapesofgeometryteachersedition;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private View item1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new IntroFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_introduction);
        }

    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_introduction:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new IntroFragment()).commit();
                break;

            case R.id.line:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LineFragment()).commit();
                break;

            case R.id.line2:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LineTwoFragment()).commit();
                break;

            case R.id.linelhw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LineHwFragment()).commit();
                break;

            case R.id.line_segment:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LineSegmentFragment()).commit();
                break;
            case R.id.line_segment_hw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LineSegmentHwFragment()).commit();
                break;
            case R.id.halfLine:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HalfLineFragment()).commit();
                break;
            case R.id.halfLineHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HalfLineHwFragment()).commit();
                break;
            case R.id.modulusLine:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ModulusLineFragment()).commit();
                break;
            case R.id.modulusLineHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ModulusLineHwFragment()).commit();
                break;
            case R.id.angle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AngleFragment()).commit();
                break;
            case R.id.angleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AngleHwFragment()).commit();
                break;
            case R.id.straightAngle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new StraightAngleFragment()).commit();
                break;
            case R.id.straightAngle2:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new StraightAngleTwoFragment()).commit();
                break;
            case R.id.straightAngleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new StraightAngleHwFragment()).commit();
                break;
            case R.id.modulusAngle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ModulusAngleFragment()).commit();
                break;
            case R.id.modulusAngleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ModulusAngleHwFragment()).commit();
                break;
            case R.id.acuteAngle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AcuteAngleFragment()).commit();
                break;
            case R.id.acuteAngleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AcuteAngleHwFragment()).commit();
                break;
            case R.id.rightAngle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RightAngleFragment()).commit();
                break;
            case R.id.rightAngleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RightAngleHwFragment()).commit();
                break;
            case R.id.obtuseAngle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ObtuseAngleFragment()).commit();
                break;
            case R.id.obtuseAngleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ObtuseAngleHwFragment()).commit();
                break;
            case R.id.reflexAngle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ReflexAngleFragment()).commit();
                break;
            case R.id.reflexAngleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ReflexAngleHwFragment()).commit();
                break;
            case R.id.parallelLines:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ParallelLinesFragment()).commit();
                break;
            case R.id.parallelLinesHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ParallelLinesHwFragment()).commit();
                break;
            case R.id.perpendicularLines:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PerpendicularLinesFragment()).commit();
                break;
            case R.id.perpendicularLinesHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PerpendicularLinesHwFragment()).commit();
                break;
            case R.id.supplementaryAngles:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SupplementaryAnglesFragment()).commit();
                break;
            case R.id.supplementaryAnglesHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SupplementaryAnglesHwFragment()).commit();
                break;
            case R.id.verticallyOppositeAngles:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VerticallyOppositeAnglesFragment()).commit();
                break;
            case R.id.verticallyOppositeAnglesHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VerticallyOppositeAnglesHwFragment()).commit();
                break;
            case R.id.correspondingAngles:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CorrespondingAnglesFragment()).commit();
                break;
            case R.id.correspondingAnglesHw1:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CorrespondingAnglesHw1Fragment()).commit();
                break;
            case R.id.correspondingAnglesHw2:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CorrespondingAnglesHw2Fragment()).commit();
                break;
            case R.id.correspondingAnglesHw3:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CorrespondingAnglesHw3Fragment()).commit();
                break;
            case R.id.correspondingAnglesHw4:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CorrespondingAnglesHw4Fragment()).commit();
                break;
            case R.id.alternatingAngles:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AlternateAnglesFragment()).commit();
                break;
            case R.id.alternatingAnglesHw1:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AlternatingAnglesHw1Fragment()).commit();
                break;
            case R.id.alternatingAnglesHw2:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AlternatingAnglesHw2Fragment()).commit();
                break;
            case R.id.triangle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TriangleFragment()).commit();
                break;
            case R.id.triangleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TriangleHwFragment()).commit();
                break;
            case R.id.scaleneTriangle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ScaleneTriangleFragment()).commit();
                break;
            case R.id.scaleneTriangleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ScaleneTriangleHwFragment()).commit();
                break;
            case R.id.isoscelesTriangle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new IsoscelesTriangleFragment()).commit();
                break;
            case R.id.isoscelesTriangleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new IsoscelesTriangleHwFragment()).commit();
                break;
            case R.id.equilateralTriangle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new EquilateralTriangleFragment()).commit();
                break;
            case R.id.equilateralTriangleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new EquilateralTriangleHwFragment()).commit();
                break;
            case R.id.similarTriangles:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SimilarTrianglesFragment()).commit();
                break;
            case R.id.similarTrianglesEnlargeHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SimilarTrianglesHwFragment()).commit();
                break;

            case R.id.similarTrianglesDiminHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SimilarTrianglesDiminHwFragment()).commit();
                break;
            case R.id.congruentTriangles:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CongruentTrianglesFragment()).commit();
                break;
            case R.id.congruentTrianglesHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CongruentTrianglesHwFragment()).commit();
                break;
            case R.id.quadrilateral:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new QuadrilateralFragment()).commit();
                break;
            case R.id.quadrilateralHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new QuadrilateralHwFragment()).commit();
                break;
            case R.id.parallelagram:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ParallelagramFragment()).commit();
                break;
            case R.id.parallelagramHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ParallelagramHwFragment()).commit();
                break;
            case R.id.rhombus:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RhombusFragment()).commit();
                break;
            case R.id.rhombusHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RhombusHwFragment()).commit();
                break;
            case R.id.rectangle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RectangleFragment()).commit();
                break;
            case R.id.rectangleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RectangleHwFragment()).commit();
                break;
            case R.id.square:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SquareFragment()).commit();
                break;
            case R.id.squareHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SquareHwFragment()).commit();
                break;
            case R.id.circle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CircleFragment()).commit();
                break;
            case R.id.circleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CircleHwFragment()).commit();
                break;
            case R.id.circumference:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CircumferenceFragment()).commit();
                break;
            case R.id.circumferenceHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CircumferenceHwFragment()).commit();
                break;
            case R.id.arc:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ArcFragment()).commit();
                break;
            case R.id.arcHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ArcHwFragment()).commit();
                break;
            case R.id.diameter:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DiameterFragment()).commit();
                break;
            case R.id.diameterHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DiameterHwFragment()).commit();
                break;
            case R.id.radius:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RadiusFragment()).commit();
                break;
            case R.id.radiusHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RadiusHwFragment()).commit();
                break;
            case R.id.chord:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ChordFragment()).commit();
                break;
            case R.id.chordHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ChordHwFragment()).commit();
                break;
            case R.id.secant:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SecantFragment()).commit();
                break;
            case R.id.secantHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SecantHwFragment()).commit();
                break;
            case R.id.tangent:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TangentFragment()).commit();
                break;
            case R.id.tangentHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TangentHwFragment()).commit();
                break;
            case R.id.segmentCircle:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SegmentCircleFragment()).commit();
                break;
            case R.id.segmentCircleHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SegmentCircleHwFragment()).commit();
                break;
            case R.id.sector:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SectorFragment()).commit();
                break;
            case R.id.sectorHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SectorHwFragment()).commit();
                break;
            case R.id.cyclicQuadrilateral:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CyclicQuadrilateralFragment()).commit();
                break;
            case R.id.cyclicQuadrilateralHw:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CyclicQuadrilateralHwFragment()).commit();
                break;

            case R.id.lineAndAnglesQuestions:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LinesAnglesQuestionsFragment()).commit();
                break;

            case R.id.triangleExercise:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TriangleExercisesFragment()).commit();
                break;

            case R.id.quadrilateralExercises:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new QuadrilateralExercisesFragment()).commit();
                break;

            case R.id.circleExercises:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CircleExercisesFragment()).commit();
                break;


        }

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


}