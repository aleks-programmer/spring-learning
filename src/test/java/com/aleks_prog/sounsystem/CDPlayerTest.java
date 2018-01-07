package com.aleks_prog.sounsystem;

import com.aleks_prog.soundsystem.CDPlayerConfig;
import com.aleks_prog.soundsystem.CompactDisc;
import com.aleks_prog.soundsystem.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer mp;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void compactDiscShouldNotBeNull() {
        assertNotNull(mp);
    }

    @Test
    public void cdShouldBePlayed() {
        mp.play();
        assertEquals("Playing Band by the Beatles", log.getLog());
    }
}
