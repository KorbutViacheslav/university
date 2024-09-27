package ua.develop.universitymanagement.web.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.develop.universitymanagement.dto.group.AcademicGroupRead;
import ua.develop.universitymanagement.dto.group.AcademicGroupSave;
import ua.develop.universitymanagement.service.AcademicGroupService;
import ua.develop.universitymanagement.web.controller.AcademicGroupController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/group")
public class AcademicGroupControllerImpl implements AcademicGroupController {
    private final AcademicGroupService academicGroupService;

    @PostMapping("/group")
    @ResponseStatus(HttpStatus.CREATED)
    @Override
    public AcademicGroupRead createAcademicGroup(AcademicGroupSave academicGroupSave) {
        return academicGroupService.saveAcademicGroup(academicGroupSave);
    }
    @GetMapping("/group/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Override
    public AcademicGroupRead getAcademicGroupById(@PathVariable Integer id) {
        return null;
    }

    @Override
    public AcademicGroupRead updateAcademicGroup(AcademicGroupSave academicGroupSave) {
        return null;
    }

    @Override
    public void deleteAcademicGroupById(Integer id) {

    }
}
