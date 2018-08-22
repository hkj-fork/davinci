/*
 * <<
 * Davinci
 * ==
 * Copyright (C) 2016 - 2018 EDP
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *       http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * >>
 */

package edp.davinci.dto.projectDto;

import lombok.Data;

@Data
public class ProjectPermission {

    private Short sourcePermission = 1;

    private Short viewPermission = 1;

    private Short widgetPermission = 1;

    private Short vizPermission = 1;

    private Short schedulePermission = 1;

    private Boolean sharePermission = false;

    private Boolean downloadPermission = false;


    public ProjectPermission() {
    }

    public ProjectPermission(Short permission) {
        this.sourcePermission = permission;
        this.viewPermission = permission;
        this.widgetPermission = permission;
        this.vizPermission = permission;
        this.schedulePermission = permission;
    }
}
