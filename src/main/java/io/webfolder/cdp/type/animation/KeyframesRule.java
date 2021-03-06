/**
 * cdp4j - Chrome DevTools Protocol for Java
 * Copyright © 2017, 2018 WebFolder OÜ (support@webfolder.io)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.webfolder.cdp.type.animation;

import java.util.ArrayList;
import java.util.List;

/**
 * Keyframes Rule
 */
public class KeyframesRule {
    private String name;

    private List<KeyframeStyle> keyframes = new ArrayList<>();

    /**
     * CSS keyframed animation's name.
     */
    public String getName() {
        return name;
    }

    /**
     * CSS keyframed animation's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * List of animation keyframes.
     */
    public List<KeyframeStyle> getKeyframes() {
        return keyframes;
    }

    /**
     * List of animation keyframes.
     */
    public void setKeyframes(List<KeyframeStyle> keyframes) {
        this.keyframes = keyframes;
    }
}
